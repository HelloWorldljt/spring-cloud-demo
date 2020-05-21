package com.springcloud.businessserver.controller;

import com.springcloud.businessserver.partner.UserClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lijiangtao
 * @Description 测试fegin
 * @date 2020/3/5 15:43
 */
@RestController
public class TestController {

    @Autowired
    private UserClient userClient;

    @GetMapping("/testFeign")
    public String testFeign(){
        return userClient.healths();
    }

    @GetMapping("/testFeign2")
    public String testFeign2(){
        return userClient.health();
    }

}
