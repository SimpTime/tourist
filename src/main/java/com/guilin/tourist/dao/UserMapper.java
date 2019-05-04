package com.guilin.tourist.dao;

import com.guilin.tourist.dao.base.BaseMapper;
import com.guilin.tourist.model.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {

}