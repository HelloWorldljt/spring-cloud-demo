package com.springcloud.businessserver.partner;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("USER-SERVER")
public interface UserClient {

    @GetMapping("/healths")
    public String healths();

    @GetMapping("/")
    public String health();

}
