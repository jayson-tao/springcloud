package com.yaorange;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Hello world!
 *
 */
@SpringBootApplication
//本服务启动后会自动注册进eureka服务中
@EnableEurekaClient
//@EnableDiscoveryClient
public class DeptProvider_8011 {
    public static void main( String[] args ) {
        SpringApplication.run(DeptProvider_8011.class,args);
    }
}
