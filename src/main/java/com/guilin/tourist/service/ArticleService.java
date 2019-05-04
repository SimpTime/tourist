package com.guilin.tourist.service;

import com.guilin.tourist.model.dto.ArticleDTO;

import java.util.List;

public interface ArticleService {

    List<ArticleDTO> list(String tag);
}
