package com.configclient.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lijiangtao
 * @Description
 * @date 2020/3/10 16:58
 */
@RefreshScope
@RestController
public class TestController {

    @Value("${from}")
    private String from;

    @GetMapping("/from")
    public String getFrom(){
        return this.from;
    }
}
