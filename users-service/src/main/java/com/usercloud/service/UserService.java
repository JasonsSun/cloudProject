package com.usercloud.service;

import com.usercloud.user.mapper.UserMapper;
import com.usercloud.user.pojo.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {
    @Resource
    private UserMapper userMapper;

    public User queryById(Long id) {
        return this.userMapper.selectByPrimaryKey(id);
    }
    public String queryUserNameById(Long id) {
        return this.userMapper.selectByPrimaryKey(id).getName();
    }
}