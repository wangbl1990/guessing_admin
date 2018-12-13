package com.mifan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @auther wangbinlei
 * @create 2018/12/13
 */
@Controller
@RequestMapping("/banner")
public class BannerController {

    @RequestMapping("list")
    public String bannerList(Model model){
        return "banner_list";
    }
}
