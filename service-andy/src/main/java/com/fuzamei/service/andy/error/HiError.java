package com.fuzamei.service.andy.error;

import com.fuzamei.service.andy.service.ISayHelloService;
import org.springframework.context.annotation.Configuration;

/**
 * @program: microservice-sleuth
 * @description:
 * @author: Andy
 * @create: 2018-12-12 15:40
 **/
@Configuration
public class HiError implements ISayHelloService {


    @Override
    public String sayHello(String name) {
        return "调用service-hi服务错误……";
    }
}
