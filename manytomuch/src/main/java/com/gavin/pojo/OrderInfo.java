package com.gavin.pojo;

import java.io.Serializable;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * orderInfo
 * @author 
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderInfo implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer oid;

    private Integer ordernum;

    private Integer userid;
    //    一对一  一条订单 对应一条订单信息
  List  <OrdersDetail> ordersdetail;

//    //一条订单信息对商品    一对多
//    private List<Product>products;

}