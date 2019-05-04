package com.guilin.tourist.service.impl;

import com.guilin.tourist.dao.UserMapper;
import com.guilin.tourist.model.entity.User;
import com.guilin.tourist.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public User get(User one) {
        return userMapper.selectOne(one);
    }

    @Override
    public int insertSelective(User one) {
        return userMapper.insertSelective(one);
    }
}
