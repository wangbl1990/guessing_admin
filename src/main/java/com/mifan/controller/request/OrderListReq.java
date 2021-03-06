package com.mifan.controller.request;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderListReq {

    private int pageNum;

    private int pageSize = 10;

    private String userName;

    private String orderId;
}
