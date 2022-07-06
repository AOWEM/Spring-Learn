package com.yuanh.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * 纯注解开发bean
 * 可以代替spring的配置文件
 * @Configuration 这是个配置类
 * @ComponentScan 扫描
 * @PropertySource 属性源加载外部文件properties
 */
@Configuration
@ComponentScan({"com.yuanh.service","com.yuanh.dao"})
@PropertySource("jdbc.properties")
public class SpringConfig {
}
