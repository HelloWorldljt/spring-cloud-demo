package com.springcloud.rabbitmqserver.producer;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author lijiangtao
 * @Description
 * @date 2020/3/18 11:37
 */
@Component
public class Sender {

    @Autowired
    private AmqpTemplate amqpTemplate;

    public void send(){
        String message = "hello " + new Date();
        amqpTemplate.convertAndSend("hello",message);
    }

}
