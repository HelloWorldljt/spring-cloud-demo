package com.springcloud.rabbitmqserver.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author lijiangtao
 * @Description
 * @date 2020/3/18 12:48
 */
@Component
@RabbitListener(queues = "hello")
public class Consumer {

    @RabbitHandler
    public void process(String hello){
        System.out.println("receiver " + hello);
    }
}
