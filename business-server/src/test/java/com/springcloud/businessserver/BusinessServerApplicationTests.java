package com.springcloud.businessserver;

import com.springcloud.businessserver.model.Order;
import com.springcloud.businessserver.service.OrderService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BusinessServerApplicationTests {

    @Autowired
    private OrderService orderService;

    @Test
    void contextLoads() {
        Order order = orderService.selectByPrimaryKey(1L);
        System.out.println(order);
    }

}
