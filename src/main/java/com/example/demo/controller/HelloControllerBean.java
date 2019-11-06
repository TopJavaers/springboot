package com.example.demo.controller;

import com.example.demo.beans.UserBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@EnableConfigurationProperties({UserBody.class})
public class HelloControllerBean {
    @Resource
    UserBody userBody;

    @GetMapping("/getUser")
    public String getUser(){
        return userBody.toString();
    }
}
