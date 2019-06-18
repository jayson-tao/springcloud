package com.yaorange;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
//index:http://localhost:9000/hystrix
public class HystrixDashboard {
    public static void main( String[] args ) {
        SpringApplication.run(HystrixDashboard.class,args);
    }
}
