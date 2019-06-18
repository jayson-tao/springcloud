package com.yaorange;


import com.yaorange.rule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * 服务消费者
 */
@SpringBootApplication
@EnableEurekaClient
//负载均衡配置  name -》调用的服务名  configuration:路由规则（服务集群需要 默认轮询）
@RibbonClient(name = "SPRINGCLOUD-DEPT",configuration = MySelfRule.class)
public class DeptConsumer_80 {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer_80.class, args);
    }
}
