package com.yuanh.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 纯注解开发bean
 * 可以代替spring的配置文件
 * @Configuration 这是个配置类
 * @ComponentScan 扫描
 */
@Configuration
@ComponentScan("com.yuanh")
public class SpringConfig {
}
