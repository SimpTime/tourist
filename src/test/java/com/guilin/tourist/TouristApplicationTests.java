package com.guilin.tourist;

import com.guilin.tourist.constant.BaseConstant;
import com.guilin.tourist.dao.ArticleMapper;
import com.guilin.tourist.dao.UserMapper;
import com.guilin.tourist.model.entity.Article;
import com.guilin.tourist.model.entity.User;
import com.guilin.tourist.util.MD5Utils;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class TouristApplicationTests {

    @Resource
    private UserMapper mapper;

    @Resource
    private ArticleMapper articleMapper;

    @Test
    public void test(){
        User user = new User();
        user.setUsername("小明");
        user.setEmail("123456@qq.com");
        user.setPassword(MD5Utils.getMD5("123456"));
        user.setTel("15778395123");
        mapper.insert(user);

        // 测试查询
        User temp = new User();
        temp.setUsername("小明");
        String password = "123456";
        temp.setPassword(MD5Utils.getMD5(password));

        User one = mapper.selectOne(temp);

        log.info("查询结果：{}", one);
    }

    @Test
    public void articleTest(){
        Article article = new Article();
        article.setAdminId(1001);
        // 新闻
        for (int i=0; i<60; i++){
           article.setTitle("桂林山水新闻"+i);
           article.setContent("桂林山水甲天下，阳朔山水甲桂林，正如不到长城非好汉，到桂林不到阳朔亦非好汉。阳朔县，隶属于广西壮族自治区桂林市，位于广西东北部。而阳朔最出名的非属十里画廊了，十里画廊位于阳朔月亮山，因沿路风景秀丽，如诗如画，被称为阳朔十里画廊。主要景观有海豚出水、火焰山、龙角山、青厄风光、古榕美景等。建议游览十里画廊时选择骑行游行，不仅悠然自得的欣赏，还能锻炼身体，放松身心，岂不快哉？");
           article.setTag(BaseConstant.ARTICLE_CLASS_NEWS);
           articleMapper.insert(article);
        }
        // 景点
        for (int i=0; i<60; i++){
            article.setTitle("象鼻山原名漓山"+i);
            article.setContent("桂林山水甲天下，阳朔山水甲桂林，正如不到长城非好汉，到桂林不到阳朔亦非好汉。阳朔县，隶属于广西壮族自治区桂林市，位于广西东北部。而阳朔最出名的非属十里画廊了，十里画廊位于阳朔月亮山，因沿路风景秀丽，如诗如画，被称为阳朔十里画廊。主要景观有海豚出水、火焰山、龙角山、青厄风光、古榕美景等。建议游览十里画廊时选择骑行游行，不仅悠然自得的欣赏，还能锻炼身体，放松身心，岂不快哉？\");\n");
            article.setTag(BaseConstant.ARTICLE_CLASS_SCENIC);
            articleMapper.insert(article);
        }
        // 美食
        for (int i=0; i<60; i++){
            article.setTitle("桂林美食街"+i);
            article.setContent("桂林山水甲天下，阳朔山水甲桂林，正如不到长城非好汉，到桂林不到阳朔亦非好汉。阳朔县，隶属于广西壮族自治区桂林市，位于广西东北部。而阳朔最出名的非属十里画廊了，十里画廊位于阳朔月亮山，因沿路风景秀丽，如诗如画，被称为阳朔十里画廊。主要景观有海豚出水、火焰山、龙角山、青厄风光、古榕美景等。建议游览十里画廊时选择骑行游行，不仅悠然自得的欣赏，还能锻炼身体，放松身心，岂不快哉？\");\n");
            article.setTag(BaseConstant.ARTICLE_CLASS_FOOD);
            articleMapper.insert(article);
        }

    }
}
