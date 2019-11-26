package com.yang.config.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Mu_Yi
 * @Date: 2019/11/26 22:46
 * @Version 1.0
 * @qq: 1411091515
 */

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class ConfigClientApplication {

    @Value("${auther}")
    private String auther;

    public static void main(String[] args) {
        SpringApplication.run(ConfigClientApplication.class,args);
    }

    @GetMapping("/auther")
    public Object auther(){
        return auther;
    }

}
