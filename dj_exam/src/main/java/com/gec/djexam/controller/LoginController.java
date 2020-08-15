package com.gec.djexam.controller;

import com.gec.djexam.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("login")
public class LoginController {

    @Autowired
    private UserService userService;
    @RequestMapping("tologin")
    public String toLogin(){
        return "login";
    }



}
