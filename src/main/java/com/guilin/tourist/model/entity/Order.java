package com.guilin.tourist.model.entity;

import java.util.Date;
import lombok.Data;

@Data
public class Order {
    /**
    * 
    */
    private Integer id;

    /**
    * 用户id
    */
    private Integer userId;

    /**
    * 名称
    */
    private String name;

    /**
    * 地点名称
    */
    private String place;

    /**
    * 价格
    */
    private Integer price;

    /**
    * 创建时间
    */
    private Date createTime;

    /**
    * 类别, 酒店：A 景点：B
    */
    private String tag;
}