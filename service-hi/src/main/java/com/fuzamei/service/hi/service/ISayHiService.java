package com.fuzamei.service.hi.service;

import com.fuzamei.service.hi.error.Error;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @program: microservice-sleuth
 * @description:
 * @author: Andy
 * @create: 2018-12-12 15:46
 **/
@Service
@FeignClient(value = "service-andy",fallback = Error.class)
public interface ISayHiService {
    @GetMapping(value = "/sayHello1")
    String sayHi1(@RequestParam(value = "name") String name);
}
