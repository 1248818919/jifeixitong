package com.whut.jifeixitong.controller;

import com.whut.jifeixitong.entities.User;
import com.whut.jifeixitong.service.LoginRegisterService;
import com.whut.jifeixitong.utils.CommonResult;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
@Slf4j
@RequiredArgsConstructor
public class LoginRegisterController {
    @Autowired
    LoginRegisterService loginRegisterService;

    @PostMapping("/login")
    public CommonResult login(@RequestBody User user){
        boolean res = loginRegisterService.login(user);
        if(res)
        {
            if(Objects.equals(user.getUsertype(), "1")) {
                user.setPosition(loginRegisterService.getPosition(user));
            }
            return CommonResult.success(user);
        }
        return CommonResult.fail(false);
    }

    @PostMapping("/register")
    public CommonResult Register(@RequestBody User user)
    {
        boolean res = loginRegisterService.Register(user);
        if(res)
        {
            return CommonResult.success(true);
        }
        return CommonResult.fail(false);
    }
}
