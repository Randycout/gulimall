package com.chen.gulimall.member;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

//开启远程服务调用
@EnableFeignClients(basePackages = "com.chen.gulimall.member.feign")
@EnableDiscoveryClient//开启配置中心nacos服务
//@MapperScan("com.chen.gulimall.member.dao")
@SpringBootApplication
public class GulimallMemberApplication {
    public static void main(String[] args) {
        SpringApplication.run(GulimallMemberApplication.class, args);
    }

}
