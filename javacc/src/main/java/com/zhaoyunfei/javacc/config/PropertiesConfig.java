package com.zhaoyunfei.javacc.config;


import com.zhaoyunfei.javacc.properties.StorageProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author ZhaoYunFei
 */
@EnableConfigurationProperties
@Configuration
public class PropertiesConfig {

    @Bean
    public StorageProperties stroageProperties() {
        return new StorageProperties();
    }

}
