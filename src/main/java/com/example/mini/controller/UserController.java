package com.example.mini.controller;

import com.example.mini.component.LoginUserHolder;
import com.example.mini.entity.UserVo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <br>
 *
 * @author cuijing
 * @className UserController
 * @date 2021-03-15 02:44
 */
@RestController
@RequestMapping("/user")
public class UserController{

    @Resource
    private LoginUserHolder loginUserHolder;

    @GetMapping("/currentUser")
    public UserVo currentUser() {
        return loginUserHolder.getCurrentUser();
    }

}