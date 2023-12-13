package com.whut.jifeixitong.service.Impl;

import cn.hutool.crypto.digest.DigestUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.whut.jifeixitong.entities.User;
import com.whut.jifeixitong.mapper.LoginRegisterMapper;
import com.whut.jifeixitong.service.LoginRegisterService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
@Slf4j
public class LoginRegisterServiceImpl implements LoginRegisterService {

    @Autowired
    LoginRegisterMapper loginRegisterMapper;

    @Override
    public boolean login(User user) {
        log.info("login params = " + user);
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("username", user.getUsername());
        queryWrapper.eq("usertype", user.getUsertype());
        User user_com = loginRegisterMapper.selectOne(queryWrapper);
        //条件成立，数据库没有对应用户登录失败
        if(null == user_com)
        {
            return  false;
        }
        // 使用胡图工具进行加密
        String encodePwd = DigestUtil.md5Hex(user.getPassword());
        if (Objects.equals(encodePwd,user_com.getPassword()) && Objects.equals(user_com.getUsertype(), user.getUsertype())) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Integer getPosition(User user) {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("username", user.getUsername());
        queryWrapper.select("position");
        User userPos = loginRegisterMapper.selectOne(queryWrapper);
        return userPos.getPosition();
    }


    @Override
    public boolean Register(User user) {
        log.info("Register params = " + user);
        // 采集要插入的账号信息
        if(Objects.equals(user.getUsername(), "") || Objects.equals(user.getPassword(), "") || Objects.equals(user.getUsertype(), ""))
            return false;
        // 密码进行加密
        user.setPassword(DigestUtil.md5Hex(user.getPassword()));
        int rows = loginRegisterMapper.insert(user);
        return rows > 0;
    }
}
