package com.mifan.domain;

import com.github.pagehelper.PageInfo;
import com.mifan.controller.request.OrderListReq;
import com.mifan.controller.request.SettleOrderListReq;
import com.mifan.controller.response.OrderListRes;
import com.mifan.controller.response.SettleOrderListRes;
import com.mifan.guessing.service.OrderService;
import com.mifan.guessingapi.request.order.BossOrderListRequest;
import com.mifan.guessingapi.request.order.BossSettleOrderListRequest;
import com.mifan.guessingapi.response.BaseResponse;
import com.mifan.guessingapi.response.order.BossOrderListResponse;
import com.mifan.guessingapi.response.order.BossSettleOrderListResponse;
import com.mifan.utils.BeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class BossOrderDomain {

    @Autowired
    private OrderService orderService;

    /**
     * 订单列表
     * @return
     */
    public PageInfo<OrderListRes> orderList(OrderListReq orderListReq) {
        BossOrderListRequest request = BeanMapper.map(orderListReq,BossOrderListRequest.class);
        BaseResponse<PageInfo<BossOrderListResponse>> pageInfoBaseResponse = orderService.orderList(request);
        PageInfo pageInfo = pageInfoBaseResponse.getResult();
        pageInfo.setList(BeanMapper.mapList(pageInfo.getList(),OrderListRes.class));
        return pageInfo;
    }

    /**
     * 注单列表
     */
    public PageInfo<SettleOrderListRes> settleOrderList(SettleOrderListReq settleOrderListReq) {

        BossSettleOrderListRequest request = BeanMapper.map(settleOrderListReq,BossSettleOrderListRequest.class);
        BaseResponse<PageInfo<BossSettleOrderListResponse>> pageInfoBaseResponse = orderService.settleList(request);
        PageInfo pageInfo = pageInfoBaseResponse.getResult();
        pageInfo.setList(BeanMapper.mapList(pageInfo.getList(),SettleOrderListRes.class));
        return pageInfo;
    }
}
