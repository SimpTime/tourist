package com.guilin.tourist.service;

import com.guilin.tourist.model.entity.User;

public interface UserService {

    /**
     * 查询用户
     */
    User get(User one);

    /**
     * 注册用户
     */
    int insertSelective(User one);
}
