package com.guilin.tourist.model.dto;

import lombok.Data;

import java.util.Date;

@Data
public class ArticleDTO {
    /**
     *
     */
    private Integer adminId;

    /**
     * 发布人的管理员id
     */
    private String name;

    /**
     * 标题，作为唯一标识
     */
    private String title;

    /**
     * 发布内容
     */
    private String content;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 类别，新闻：NEW, 美食：FOO，景点：SCE
     */
    private String tag;

    /**
     * 封面url
     */
    private String url;
}
