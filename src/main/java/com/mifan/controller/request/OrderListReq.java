package com.mifan.controller.request;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderListReq {

    private int pageNo;

    private int pageSize;

    private String userName;

    private String orderId;
}
