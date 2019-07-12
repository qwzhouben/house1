package com.zben.house.controller;

import com.zben.house.common.model.User;
import com.zben.house.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @DESC:
 * @author: jhon.zhou
 * @date: 2019/7/12 0012 14:07
 */
@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/user")
    public List<User> listUser() {
        return userService.listUser();
    }
}
