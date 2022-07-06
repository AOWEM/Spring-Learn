package com.yuanh.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.*;

import javax.sql.DataSource;

/**
 * 纯注解开发bean
 * 可以代替spring的配置文件
 * @Configuration 这是个配置类
 * @ComponentScan 扫描
 * @PropertySource 属性源加载外部文件properties
 * @Import 建议使用这个导入其他配置类
 */
@Configuration
/*@ComponentScan({"com.yuanh.service","com.yuanh.dao"})
@PropertySource("jdbc.properties")*/
//@ComponentScan("com.yuanh.config")
@ComponentScan("com.yuanh.dao")
@PropertySource("jdbc.properties")
@Import(JdbcConfig.class)
public class SpringConfig {

    //1.定义一个方法获得要管理的对象
    //2.添加 @Bean，表示当前方法的返回值是一个bean
    /*@Bean
    public DataSource dataSource(){
        DruidDataSource ds = new DruidDataSource();
        ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
        ds.setUrl("jdbc:mysql://127.0.0.1:3306/spring_db");
        ds.setUsername("root");
        ds.setPassword("123456");
        return ds;
    }*/
}
