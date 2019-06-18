package com.yaorange;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

/**
 * 服务熔断
 *
 */
@SpringBootApplication
//@EnableEurekaClient//本服务启动后会自动注册进eureka服务中
//@EnableDiscoveryClient
@EnableCircuitBreaker //对hystrixR熔断机制的支持
public class DeptProvider_Hystrix_8014 {
    public static void main( String[] args )
    {
        SpringApplication.run(DeptProvider_Hystrix_8014.class,args);
    }
}
