package com.yang.weather.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author: Mu_Yi
 * @Date: 2019/11/25 23:42
 * @Version 1.0
 * @qq: 1411091515
 */

@SpringBootApplication
@EnableEurekaServer
public class WeatherBasicApplication {

    public static void main(String[] args) {
        SpringApplication.run(WeatherBasicApplication.class,args);
    }

}
