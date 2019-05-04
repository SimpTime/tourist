package com.guilin.tourist.service.impl;

import com.guilin.tourist.dao.AdminMapper;
import com.guilin.tourist.model.entity.Admin;
import com.guilin.tourist.service.AdminService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AdminServiceImpl implements AdminService {

    @Resource
    private AdminMapper adminMapper;

    @Override
    public Admin get(Admin one) {
        return adminMapper.selectOne(one);
    }
}
