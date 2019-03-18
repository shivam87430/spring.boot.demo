package com.spring.spring.boot.demo.controller;

import com.spring.spring.boot.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @Autowired
    User user;

    @GetMapping("/user")
    @ResponseBody
    public String getUser(){
        return "UserName is :" + user.getUsername() +" "+"Password "+ user.getPassword();
    }
}
