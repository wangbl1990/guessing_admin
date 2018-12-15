package com.mifan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @auther wangbinlei
 * @create 2018/12/13
 */
@Controller
@RequestMapping("/order")
public class OrderController {

    @RequestMapping("list")
    public String bannerList(Model model){
        return "order_list";
    }
}
