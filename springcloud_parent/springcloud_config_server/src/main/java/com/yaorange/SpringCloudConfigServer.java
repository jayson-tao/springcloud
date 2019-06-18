package com.yaorange;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer  //开启配置服务
public class SpringCloudConfigServer {
    public static void main( String[] args ) {
        SpringApplication.run(SpringCloudConfigServer.class,args);
    }
}
