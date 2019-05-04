package com.guilin.tourist.dao;

import com.guilin.tourist.dao.base.BaseMapper;
import com.guilin.tourist.model.dto.ArticleDTO;
import com.guilin.tourist.model.entity.Article;
import org.apache.ibatis.annotations.Mapper;import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ArticleMapper extends BaseMapper<Article> {

    List<ArticleDTO> list(@Param("tag")String tag);
}