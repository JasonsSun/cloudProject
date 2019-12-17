package com.eurakacloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer // 声明这个应⽤用是⼀一个EurekaServer
public class EurekaDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaDemoApplication.class, args);
    }
}