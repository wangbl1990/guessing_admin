package com.mifan.controller;

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
    public String orderList(Model model){
        List<OrderListRes> orderList = orderDomain.orderList();
        model.addAttribute("orderList",orderList);
        return "order_list";
    }

    @RequestMapping("settleList")
    public String settleList(Model model){
        List<SettleOrderListRes> settleOrderListRes = orderDomain.settleOrderList();
        model.addAttribute("settleOrderList",settleOrderListRes);
        return "order_list";
    }
}
