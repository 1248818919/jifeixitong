package com.whut.jifeixitong.service;

import com.whut.jifeixitong.entities.User;

public interface LoginRegisterService {

    /**
     * 登录接口
     * @param user
     * @return 返回登录是否成功
     */
    boolean login(User user);

    Integer getPosition(User user);

    /**
     * 注册接口
     * @param user
     * @return 返回注册是否成功
     */
    boolean Register(User user);

}
