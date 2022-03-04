package com.vader.test;

import com.vader.rpc.api.HelloObject;
import com.vader.rpc.api.HelloService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloServiceImpl implements HelloService {
    private static final Logger logger = LoggerFactory.getLogger(HelloService.class);
    @Override
    public String hello(HelloObject obj) {
        logger.info("收到消息：{}", obj.getMessage());
        return "HelloService的实现方法";
    }
}
