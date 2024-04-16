package com.zhaoyunfei.javacc.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.unit.DataSize;

import javax.servlet.MultipartConfigElement;

/**
 * 上传文件大小设置
 *
 * @author ZhaoYunFei
 */
@Configuration
public class MultipartConfig {

    @Bean
    public MultipartConfigElement multipartConfigElement(@Value("${multipart.maxFileSize}") String maxFileSize,
                                                         @Value("${multipart.maxRequestSize}") String maxRequestSize) {

        MultipartConfigFactory factory = new MultipartConfigFactory();
        factory.setMaxFileSize(DataSize.parse(maxFileSize));
        factory.setMaxRequestSize(DataSize.parse(maxRequestSize));
        return factory.createMultipartConfig();
    }
}

