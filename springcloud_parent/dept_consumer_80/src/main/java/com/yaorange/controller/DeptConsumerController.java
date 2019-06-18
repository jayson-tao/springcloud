package com.yaorange.controller;


import com.yaorange.entry.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * 服务间调用
 */
@RestController
public class DeptConsumerController {
    //TODO SERVICE
    @Autowired
    private RestTemplate restTemplate;

    private static final String REST_URL_PRFIX = "http://SPRINGCLOUD-DEPT";

    @RequestMapping(value = "/consumer/dept/list", method = RequestMethod.GET)
    public List<Dept> list() {
        //远程调用服务
        return restTemplate.getForObject(REST_URL_PRFIX + "/dept/list", List.class);
    }
}
