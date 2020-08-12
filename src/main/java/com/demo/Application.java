package com.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * 
 * @Project kisso_springboot
 * @Description: 
 * @Company gjzq
 * @Create 2020年7月27日下午3:25:17
 * @author tengwenqing
 * @version 1.0
 * Copyright (c) 2020 gjzq, All Rights Reserved.
 */
@SpringBootApplication
public class Application extends SpringBootServletInitializer {

    private static final Logger logger = LoggerFactory.getLogger(Application.class);

    /**
     * <p>
     * 1、启动执行<br>
     * 2、访问 http://localhost:8080/token 提示登录<br>
     * 3、登录 访问 http://localhost:8080/login 成功再去 2 步骤查看<br>
     * </p>
     * <p>
     * 退出登录：http://localhost:8080/logout
     * </p>
     */
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(Application.class);
        application.run(args);
        logger.info("kisso start!");
    }

}
