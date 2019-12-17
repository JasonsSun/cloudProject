package com.zuulcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy // 开启Zuul的⽹网关功能
public class ZuulControlApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZuulControlApplication.class, args);
    }
}
