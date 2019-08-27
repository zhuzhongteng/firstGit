package com.zhu.demo.springboot.service;

import com.zhu.demo.springboot.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;

    public Integer selectUser(int id) {
        return userMapper.selectUser(id);
    }
}
