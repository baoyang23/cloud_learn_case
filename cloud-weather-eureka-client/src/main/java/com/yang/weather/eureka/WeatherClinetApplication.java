package com.yang.weather.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: Mu_Yi
 * @Date: 2019/11/25 23:46
 * @Version 1.0
 * @qq: 1411091515
 */

@SpringBootApplication
@EnableEurekaClient
public class WeatherClinetApplication {

    public static void main(String[] args) {
        SpringApplication.run(WeatherClinetApplication.class,args);
    }

}
