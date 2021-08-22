package com.chen.gulimall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/*1.整合myBatis-plus
     - 导入依赖
     - 配置
       1.配置数据源
            - 导入驱动
       2.配置mybatis-plus
   2.逻辑删除

*
*
* */
@EnableDiscoveryClient
@MapperScan("com.chen.gulimall.product.dao")
@SpringBootApplication
public class GulimallProductApplication {

    public static void main(String[] args) {

        SpringApplication.run(GulimallProductApplication.class, args);
    }

}
