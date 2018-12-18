package com.mifan.domain;

import com.mifan.controller.response.OrderListRes;
import com.mifan.controller.response.SettleOrderListRes;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class OrderDomain {


    /**
     * 订单列表
     * @return
     */
    public List<OrderListRes> orderList() {

        List<OrderListRes> list = new ArrayList<OrderListRes>();

        OrderListRes res = new OrderListRes();
        res.setEventId("123");
        res.setEventName("北京国安 vs 上海申花");
        res.setEventType("中超");
        res.setFillAmount(new BigDecimal(100));
        res.setFillPrice(new BigDecimal(50));
        res.setMarketId("12345");
        res.setOrderId("1234576");
        res.setPlacedResult("");
        res.setRequestAmount(new BigDecimal(50));
        res.setRequestPrice(new BigDecimal(10));
        res.setSelectionId("12345");
        res.setStatus("未结算");
        res.setSubmittedTime(new Date());
        res.setUserCode("123");
        res.setUserName("张三");
        list.add(res);
        return list;
    }

    /**
     * 注单列表
     */
    public List<SettleOrderListRes> settleOrderList() {

        List<SettleOrderListRes> settleOrderList = new ArrayList<SettleOrderListRes>();
        SettleOrderListRes res = new SettleOrderListRes();
        res.setCreateTime(new Date());
        res.setEventName("北京国安 vs 上海申花");
        res.setEventType("中超");
        res.setOrderAmount(new BigDecimal(100));
        res.setOrderId("124343");
        res.setPlayName("猜大小");
        res.setSettleIncome(new BigDecimal(10));
        res.setSettleLoss(new BigDecimal(0));
        res.setSettleTime(new Date());
        res.setStatus("已结算");
        res.setType("1");
        res.setUserNikeName("马云");
        settleOrderList.add(res);
        return settleOrderList;
    }
}
