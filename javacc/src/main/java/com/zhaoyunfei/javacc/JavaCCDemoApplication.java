package com.zhaoyunfei.javacc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

/**
 * @author ZhaoYunFei
 * @since 2024/4/16 14:04
 */
@EnableResourceServer
@SpringBootApplication(scanBasePackages = {"com.zhaoyunfei.javacc"})
public class JavaCCDemoApplication {
    public static void main(String[] args) {

        SpringApplication.run(JavaCCDemoApplication.class);
    }
}