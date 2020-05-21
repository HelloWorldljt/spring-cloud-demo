package com.springcloud.rabbitmqserver;

import com.springcloud.rabbitmqserver.producer.Sender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author lijiangtao
 * @Description
 * @date 2020/3/18 17:20
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = RabbitmqServerApplication.class)
public class HelloRabbitMQTest {

    @Autowired
    private Sender sender;

    @Test
    public void hello(){
        sender.send();
    }

}
