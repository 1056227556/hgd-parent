package com.lxjn.hgd.user.controller;


import com.lxjn.hgd.user.entity.User;
import com.lxjn.hgd.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author lxjn
 * @since 2020-09-09
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("{id}")
    public User getUser(@PathVariable int id){
        return userService.getById(id);
    }

    @GetMapping("/test")
    public String test(){
        return "!@#$%^&*";
    }
}
