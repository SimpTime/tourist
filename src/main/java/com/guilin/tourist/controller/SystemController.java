package com.guilin.tourist.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.guilin.tourist.constant.BaseConstant;
import com.guilin.tourist.model.dto.ArticleDTO;
import com.guilin.tourist.model.entity.Admin;
import com.guilin.tourist.model.entity.User;
import com.guilin.tourist.service.AdminService;
import com.guilin.tourist.service.ArticleService;
import com.guilin.tourist.service.UserService;
import com.guilin.tourist.util.MD5Utils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Controller
@RequestMapping("/")
public class SystemController {

    @Resource
    private UserService userService;

    @Resource
    private AdminService adminService;

    @Resource
    private ArticleService articleService;

    /**
     * 跳转到首页
     */
    public String system(){
        return "index";
    }

    /**
     * 跳转到首页
     */
    @GetMapping("index")
    public String index(){
        return "index";
    }

    /**
     * 跳转到登录界面
     */
    @GetMapping("tologin")
    public String tologin(){
        return "login";
    }

    /**
     * 登录
     */
    @PostMapping("login")
    public String login(@RequestParam("email") String email, Model model,
                        @RequestParam("password") String password){
        User one = new User();
        one.setEmail(email);
        one.setPassword(MD5Utils.getMD5(password));
        User findUser = userService.get(one);

        Admin admin = new Admin();
        admin.setName(email);
        admin.setPassword(MD5Utils.getMD5(password));
        Admin findAdmin = adminService.get(admin);

        if (null == findUser && null == findAdmin){
            model.addAttribute(BaseConstant.RESULT, "账号或者密码错误，请重新登录！");
            return "result";

        }else if (null != findUser){
            // TODO
            // 跳转到用户界面
            return "index";

        }else if (null != findAdmin){
            // TODO
            // 跳转到管理员界面
            return "index";
        }else {
            return "login";
        }
    }

    /**
     * 跳转到注册界面
     */
    @GetMapping("toregister")
    public String toRegister(){
        return "register";
    }

    /**
     * 注册
     */
    @PostMapping("register")
    public String register(@RequestParam("username") String username,Model model,
                           @RequestParam("tel") String tel,
                           @RequestParam("email") String email,
                           @RequestParam("password") String password){
        User one = new User();
        one.setUsername(username);
        one.setTel(tel);
        one.setEmail(email);
        one.setPassword(MD5Utils.getMD5(password));

        int result = userService.insertSelective(one);
        if (result != 1){
            model.addAttribute(BaseConstant.RESULT, "注册失败！");
        }else {
            model.addAttribute(BaseConstant.RESULT, "注册成功！");
        }
        return "result";
    }

    @GetMapping("gallery")
    public String gallery(@RequestParam(value = "pn", defaultValue = "1") Integer pageNum, Model model){
        String tag = BaseConstant.ARTICLE_CLASS_SCENIC;
        PageHelper.startPage(pageNum, BaseConstant.PAGE_SIZE); // default 1 9
        List<ArticleDTO> dtos = articleService.list(tag);

        // url处理, 正则处理内容，获得
        String url = "/image/default_gallery.png"; // 默认图片
        for (ArticleDTO dto : dtos) {
            Matcher matcher = Pattern.compile(BaseConstant.IMG_SRC_REGEX).matcher(dto.getContent());
            while (matcher.find()){
                String temp = matcher.group();
                matcher = Pattern.compile(BaseConstant.IMG_URL_REGEX).matcher(temp);
                while (matcher.find()) {
                    url = matcher.group().substring(0, matcher.group().length()-1);
                    break;
                }
                break;
            }
            dto.setUrl(url);
            // 前面100字符为描述
            dto.setContent(dto.getContent().substring(0, 56) + "...");
        }
        PageInfo pageInfo = new PageInfo(dtos, BaseConstant.NAVIGATE_PAGES);// 5
        model.addAttribute("pageInfo", pageInfo);
        return "gallery";
    }
}
