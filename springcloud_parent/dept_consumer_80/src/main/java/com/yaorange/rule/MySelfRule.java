package com.yaorange.rule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 路由规则
 */
@Configuration
public class MySelfRule {
    @Bean
    public IRule getRule() {
        // return  new RandomRule();//随机算法
        return new RoundRobinRule();//轮循算法
        //return  new Rule_Of_QG();
    }
}
