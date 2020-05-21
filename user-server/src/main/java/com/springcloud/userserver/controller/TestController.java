package com.springcloud.userserver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.core.env.Environment;

/**
 * @author lijiangtao
 * @Description 测试 ribbon
 * @date 2020/3/5 15:00
 */
@RestController
public class TestController {

    @Autowired
    Environment environment;

    @GetMapping("/")
    public String health() {
        return "I am not Ok";
    }

    @GetMapping("/healths")
    public String healths() {
        return "I am not Oks";
    }

    @GetMapping("/backend")
    public String backend() {
        System.out.println("Inside MyRestController::backend...");

        String serverPort = environment.getProperty("server.port");

        System.out.println("Port : " + serverPort);

        return "Hello form Backend!!! " + " Host : localhost " + " :: Port : " + serverPort;
    }

}
