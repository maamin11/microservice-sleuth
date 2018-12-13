package com.fuzamei.service.hi.controller;

import com.fuzamei.service.hi.service.ISayHiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: microservice-sleuth
 * @description:
 * @author: Andy
 * @create: 2018-12-12 15:28
 **/
@RestController
public class SayHiController {
    @Autowired
    private ISayHiService sayHiService;

    /**
     * 该接口用于提供别人访问
     * @param name
     * @return
     */
    @GetMapping(value = "/sayHi")
    public String sayHi(@RequestParam(value = "name") String name) {
        return "service-hi,"+name;
    }

    /**
     * 该接口用于反问别人
     * @param name
     * @return
     */
    @GetMapping(value = "/sayHi1")
    public String sayHi1(@RequestParam(value = "name") String name) {
        return sayHiService.sayHi1(name);
    }
}
