package com.mifan.domain;

import com.github.pagehelper.PageInfo;
import com.mifan.controller.request.AddBannerReq;
import com.mifan.controller.request.BannerListReq;
import com.mifan.controller.response.BannerListRes;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class BannerDomain {


    public PageInfo<BannerListRes> bannerList(BannerListReq bannerListReq) {
        List<BannerListRes> resList = new ArrayList<BannerListRes>();
        BannerListRes res = new BannerListRes();
        res.setPicLink("www.baidu.com");
        res.setPicPath("picPath");
        res.setTitle("图片");
        res.setId("1");
        resList.add(res);
        PageInfo<BannerListRes> pageInfo = new PageInfo<BannerListRes>(resList);
        pageInfo.setList(resList);
        return pageInfo;
    }

    public List<BannerListRes> add(AddBannerReq addBannerReq) {
        List<BannerListRes> resList = new ArrayList<BannerListRes>();
        BannerListRes res = new BannerListRes();
        res.setPicLink("www.baidu.com");
        res.setPicPath("picPath");
        res.setTitle("图片");
        res.setId("1");
        resList.add(res);
        return resList;
    }
}
