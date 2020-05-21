package com.springcloud.streamserver.mq;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.MessageChannel;

/**
 * @author lijiangtao
 * @Description
 * @date 2020/3/20 10:42
 */
public interface SinkSender {

    @Output(Sink.INPUT)
    MessageChannel outPut();

}
