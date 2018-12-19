package com.mifan.controller;

import com.github.pagehelper.PageInfo;
import com.mifan.controller.request.OrderListReq;
import com.mifan.controller.request.SettleOrderListReq;
import com.mifan.controller.response.OrderListRes;
import com.mifan.controller.response.SettleOrderListRes;
import com.mifan.domain.OrderDomain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

/**
 * @auther wangbinlei
 * @create 2018/12/13
 */
@Controller
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderDomain orderDomain;

    @RequestMapping("list")
    public String orderList(Model model, OrderListReq orderListReq){
        PageInfo<OrderListRes> orderList = orderDomain.orderList(orderListReq);
        model.addAttribute("orderList",orderList);
        return "order_list";
    }

    @RequestMapping("settleList")
    public String settleList(Model model, SettleOrderListReq settleOrderListReq){
        PageInfo<SettleOrderListRes> settleOrderListRes = orderDomain.settleOrderList(settleOrderListReq);
        model.addAttribute("settleOrderList",settleOrderListRes);
        return "settle_order_list";
    }
}
