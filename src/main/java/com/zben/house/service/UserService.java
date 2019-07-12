package com.zben.house.service;

import com.zben.house.common.model.User;
import com.zben.house.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @DESC:
 * @author: jhon.zhou
 * @date: 2019/7/12 0012 14:08
 */
@Service
public class UserService {

    @Autowired
    UserMapper userMapper;

    public List<User> listUser() {
        return userMapper.getUsers();
    }
}
