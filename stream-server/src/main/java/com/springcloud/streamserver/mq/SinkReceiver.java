package com.springcloud.streamserver.mq;

import javafx.scene.control.Skin;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.stereotype.Component;

/**
 * @author lijiangtao
 * @Description
 * @date 2020/3/19 13:43
 */
@Component
@EnableBinding({Sink.class,SinkSender.class})
public class SinkReceiver {

    private Logger log = LoggerFactory.getLogger(SinkReceiver.class);

    @StreamListener(Sink.INPUT)
    public void hello(Object payload){
        log.info("receiver "+payload);
    }

}
