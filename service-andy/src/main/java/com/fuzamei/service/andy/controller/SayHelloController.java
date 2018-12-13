package com.fuzamei.service.andy.controller;

import com.fuzamei.service.andy.service.ISayHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: microservice-sleuth
 * @description:
 * @author: Andy
 * @create: 2018-12-12 15:28
 **/
@RestController
public class SayHelloController {
    @Autowired
    private ISayHelloService sayHelloService;

    /**
     * 该接口用于访问别人
     * @param name
     * @return
     */
    @GetMapping(value = "/sayHello")
    public String sayHello(@RequestParam(value = "name") String name) {
        return sayHelloService.sayHello(name);
    }

    /**
     * 该接口用于提供别人访问
     * @param name
     * @return
     */
    @GetMapping(value = "/sayHello1")
    public String sayHello1(@RequestParam(value = "name") String name) {
        return "service-andy,"+name;
    }

}
