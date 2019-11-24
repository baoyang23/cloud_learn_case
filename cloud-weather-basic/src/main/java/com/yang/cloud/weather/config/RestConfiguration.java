package com.yang.cloud.weather.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * 配置RestTemplate
 *
 * @Author: Mu_Yi
 * @Date: 2019/11/24 22:47
 * @Version 1.0
 * @qq: 1411091515
 */

@Configuration
public class RestConfiguration {

    @Autowired
    private RestTemplate restTemplate;

    @Bean
    public RestTemplate restTemplate(){
        return restTemplate;
    }

}
