package com.guilin.tourist.dao;

import com.guilin.tourist.dao.base.BaseMapper;
import com.guilin.tourist.model.entity.Order;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderMapper extends BaseMapper<Order> {

}