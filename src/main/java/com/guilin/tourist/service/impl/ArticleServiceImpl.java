package com.guilin.tourist.service.impl;

import com.guilin.tourist.dao.ArticleMapper;
import com.guilin.tourist.model.dto.ArticleDTO;
import com.guilin.tourist.service.ArticleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {

    @Resource
    private ArticleMapper articleMapper;

    @Override
    public List<ArticleDTO> list(String tag) {
        return articleMapper.list(tag);
    }
}
