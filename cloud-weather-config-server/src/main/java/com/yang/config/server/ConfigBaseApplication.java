package com.yang.config.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @Author: Mu_Yi
 * @Date: 2019/11/26 22:38
 * @Version 1.0
 * @qq: 1411091515
 */

@SpringBootApplication
@EnableDiscoveryClient
@EnableConfigServer
public class ConfigBaseApplication {

    public static void main(String[] args) {

        SpringApplication.run(ConfigBaseApplication.class,args);
    }

}
