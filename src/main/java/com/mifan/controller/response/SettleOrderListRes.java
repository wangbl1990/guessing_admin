package com.mifan.controller.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SettleOrderListRes {

    private String id;

    private String orderId;

    private BigDecimal orderAmount;

    private BigDecimal settleIncome;

    private BigDecimal settleLoss;

    private String type;

    private String eventType;

    private String eventName;

    private String playName;

    private String status;

    private Date settleTime;

    private Date createTime;

    private String userNikeName;

}
