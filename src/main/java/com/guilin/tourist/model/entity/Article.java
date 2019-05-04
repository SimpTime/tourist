package com.guilin.tourist.model.entity;

import java.util.Date;
import lombok.Data;

@Data
public class Article {
    /**
     *
     */
    private Integer id;

    /**
     * 发布人id
     */
    private Integer adminId;

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
}