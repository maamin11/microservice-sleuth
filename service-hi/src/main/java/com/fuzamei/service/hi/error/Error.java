package com.fuzamei.service.hi.error;

import com.fuzamei.service.hi.service.ISayHiService;
import org.springframework.context.annotation.Configuration;

/**
 * @program: microservice-sleuth
 * @description:
 * @author: Andy
 * @create: 2018-12-12 15:55
 **/
@Configuration
public class Error implements ISayHiService {
    @Override
    public String sayHi1(String name) {
        return "访问andy服务出错";
    }
}
