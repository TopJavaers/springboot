package com.example.demo.controller;


import com.example.demo.Pojo.User;
import com.example.demo.service.UserService;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;


@RestController
@RequestMapping("/users")
public class UserController1 {

    @Resource
    private UserService userService;
    @GetMapping("/")
    public List<User> getUserList(){
        return userService.getUserList();
    }
}
