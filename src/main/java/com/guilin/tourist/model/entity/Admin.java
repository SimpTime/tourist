package com.guilin.tourist.model.entity;

import lombok.Data;

@Data
public class Admin {
    /**
     *
     */
    private Integer id;

    /**
     * 管理员登录名
     */
    private String name;

    /**
     * 登录密码
     */
    private String password;
}