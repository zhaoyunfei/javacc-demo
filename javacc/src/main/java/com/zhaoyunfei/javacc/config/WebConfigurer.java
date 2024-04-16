package com.zhaoyunfei.javacc.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author admin
 */
@Configuration
public class WebConfigurer implements WebMvcConfigurer {

    /**
     * 此方法用于配置静态资源，如html、js、css等
     *
     * @param registry 空
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        String location = "file:" + System.getProperty("user.dir").replace("\\", "/") + "/";
        registry.addResourceHandler("/rmfile/**").addResourceLocations(location);

    }

}
