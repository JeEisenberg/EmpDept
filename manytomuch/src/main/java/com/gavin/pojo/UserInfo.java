package com.gavin.pojo;

import java.io.Serializable;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * user
 *
 * @author gavin
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserInfo implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer uid;

    private String uname;

    private String upwd;
    ////订单对订单信息   一个父订单 下  有很多子订单
//private List<OrdersDetail> ordersdetail;

//用户跟订单  一对多
    private List<OrderInfo> orderInfo;
    //    一对一  一条订单 对应一条订单信息
//    private OrdersDetail ordersdetail;
//    //一条订单信息对商品    一对多
//    private List<Product>products;

}