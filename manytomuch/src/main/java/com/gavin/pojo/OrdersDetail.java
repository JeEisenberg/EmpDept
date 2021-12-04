package com.gavin.pojo;

import java.io.Serializable;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ordersdetail
 * @author 
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrdersDetail implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer odid;

    private Integer orderid;

    private Integer productid;
    //一条订单信息对商品    一对多
    private List<Product>products;


}