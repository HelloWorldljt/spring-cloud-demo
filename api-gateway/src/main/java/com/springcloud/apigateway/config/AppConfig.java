package com.springcloud.apigateway.config;

import com.springcloud.apigateway.filter.MyFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author lijiangtao
 * @Description
 * @date 2020/3/6 16:34
 */
@Configuration
public class AppConfig {

    @Bean
    public MyFilter myFilter(){
        return new MyFilter();
    }


}
