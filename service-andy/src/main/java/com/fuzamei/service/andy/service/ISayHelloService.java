package com.fuzamei.service.andy.service;

import com.fuzamei.service.andy.error.HiError;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @program: microservice-sleuth
 * @description:
 * @author: Andy
 * @create: 2018-12-12 15:37
 **/
@Service
@FeignClient(value = "service-hi",fallback = HiError.class)
public interface ISayHelloService {
    @GetMapping(value = "/sayHi")
    String sayHello(@RequestParam(value = "name") String name);
}
