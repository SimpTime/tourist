package com.guilin.tourist.model.entity;

import lombok.Data;

@Data
public class User {
    /**
    * 
    */
    private Integer id;

    /**
    * 用户名
    */
    private String username;

    /**
    * 登录邮箱
    */
    private String email;

    /**
    * 密码
    */
    private String password;

    /**
    * 联系电话
    */
    private String tel;
}