package com.guilin.tourist.model.entity;

import java.util.Date;
import lombok.Data;

@Data
public class Comment {
    /**
    * 
    */
    private Integer id;

    /**
    * 文章id
    */
    private Integer articleId;

    /**
    * 评论用户id
    */
    private Integer userId;

    /**
    * 评论内容
    */
    private String content;

    /**
    * 创建时间
    */
    private Date createTime;
}