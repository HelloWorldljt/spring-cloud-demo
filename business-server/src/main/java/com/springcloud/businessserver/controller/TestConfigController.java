package com.springcloud.businessserver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lijiangtao
 * @Description
 * @date 2020/3/10 15:30
 */
@RefreshScope
@RestController
public class TestConfigController {

    @Value("${from}")
    private String from;

    @Autowired
    private Environment environment;

    @GetMapping("/from")
    public String getFrom(){
        //return environment.getProperty("from","undefined");
        return this.from;
    }


}
