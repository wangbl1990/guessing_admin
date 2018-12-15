package com.mifan.controller;

import com.mifan.controller.request.BannerListReq;
import com.mifan.controller.response.BannerListRes;
import com.mifan.domain.BannerDomain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @auther wangbinlei
 * @create 2018/12/13
 */
@Controller
@RequestMapping("/banner")
public class BannerController {

    @Autowired
    private BannerDomain bannerDomain;

    @RequestMapping("list")
    public String bannerList(Model model, BannerListReq bannerListReq){
        List<BannerListRes> bannerListResList = bannerDomain.bannerList(bannerListReq);
        model.addAttribute("bannerList",bannerListResList);
        return "banner_list";
    }
}
