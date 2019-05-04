package com.guilin.tourist.constant;

public interface BaseConstant {

    /**
     * 文章类别：新闻
     */
    String ARTICLE_CLASS_NEWS = "NEW";

    /**
     * 文章类别：美食
     */
    String ARTICLE_CLASS_FOOD = "FOO";

    /**
     * 文章类别：图片
     */
    String ARTICLE_CLASS_SCENIC = "SCE";

    /**
     * 订单类别：酒店
     */
    String ORDER_CLASS_HOTEL = "A";

    /**
     * 订单类别：景点
     */
    String ORDER_CLASS_SCENIC = "B";

    /**
     * 登录结果
     */
    String RESULT = "result";

    /**
     * 分页大小
     */
    Integer PAGE_SIZE = 9;

    /**
     * 分页大小
     */
    Integer NAVIGATE_PAGES = 5;

    /**
     * 图片src正则
     */
    String IMG_SRC_REGEX = "<img.*src=(.*?)[^>]*?>";

    /**
     * 图片url正则
     */
    String IMG_URL_REGEX = "\"?(.*?)(\"|>|\\s+)";
}
