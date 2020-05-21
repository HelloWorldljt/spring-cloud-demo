package com.springcloud.streamserver;

import com.springcloud.streamserver.mq.SinkSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * @author lijiangtao
 * @Description
 * @date 2020/3/20 10:46
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = StreamServerApplication.class)
public class HelloStreamTest {

    @Autowired
    private SinkSender sinkSender;

    @Test
    public void mqTest(){
        sinkSender.outPut().send(MessageBuilder.withPayload("from sinker ").build());
    }

}
