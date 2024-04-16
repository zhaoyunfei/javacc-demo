package com.zhaoyunfei.javacc.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author ZhaoYunFei
 * @since 2024/3/4 17:01
 */
@Data
@ConfigurationProperties(prefix = StorageProperties.PREFIX)
public class StorageProperties {
    public static final String PREFIX="storage";

    private String ip;

    private Integer port;

    private String winAddress;

    private String address;
}
