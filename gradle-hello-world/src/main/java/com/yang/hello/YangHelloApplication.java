package com.yang.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Mu_Yi
 * @Date: 2019/11/24 21:59
 * @Version 1.0
 * @qq: 1411091515
 */

@SpringBootApplication
@RestController
public class YangHelloApplication {

    public static void main(String[] args) {

        SpringApplication.run(YangHelloApplication.class,args);

    }

    @GetMapping("/hello")
    public String hello(){
        return "Hello World.";
    }

}
