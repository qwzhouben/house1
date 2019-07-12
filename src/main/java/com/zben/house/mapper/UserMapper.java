package com.zben.house.mapper;

import com.zben.house.common.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @DESC:
 * @AUTHOR: jhon.zhou
 * @DATE: 2019/7/12 0012 14:05
 */
@Mapper
public interface UserMapper {

    List<User> getUsers();
}
