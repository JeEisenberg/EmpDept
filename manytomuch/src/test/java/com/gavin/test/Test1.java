package com.gavin.test;


import com.gavin.mapper.UserInfoMapper;
import com.gavin.pojo.OrderInfo;
import com.gavin.pojo.OrdersDetail;
import com.gavin.pojo.Product;
import com.gavin.pojo.UserInfo;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Test1 {

    private SqlSession sqlSession = null;
    private SqlSessionFactory factory = null;

    @Before
    public void Init() throws IOException {
        InputStream resource = Resources.getResourceAsStream("mybatis-config.xml");
        factory = new SqlSessionFactoryBuilder().build(resource);
        sqlSession = factory.openSession();

    }

    @Test
    public void Test() {

        UserInfoMapper mapper = sqlSession.getMapper(UserInfoMapper.class);

        List<UserInfo> userOrder = mapper.findUserOrder(1);
        System.out.println(userOrder);

        for (UserInfo u :
                userOrder) {
            System.out.println("用户信息:");
            System.out.println("用户编号:" + u.getUid() + "用户姓名--" + u.getUname());

            List<OrderInfo> orderInfo = u.getOrderInfo();
            for (OrderInfo o :
                    orderInfo) {
                System.out.println("订单信息:");
                System.out.println("订单编号:" + o.getOid() + "订单号:" + o.getOrdernum());

                List<OrdersDetail> ordersdetail = o.getOrdersdetail();
                for (OrdersDetail od :
                        ordersdetail) {
                    List<Product> products = od.getProducts();
                    for (Product product :
                            products) {
                        System.out.println("商品信息:");
                        System.out.println("商品编号" + product.getPid() + "商品名称:" + product.getPname() + "商品价格:" + product.getPrice());

                    }
                }

            }

        }


    }

    @After
    public void after() {
        sqlSession.close();

    }

}





