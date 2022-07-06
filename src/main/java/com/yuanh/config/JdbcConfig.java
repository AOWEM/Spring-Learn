package com.yuanh.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.yuanh.dao.BookDao;
import com.yuanh.dao.impl.OrderDaoImpl;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
@Configuration
public class JdbcConfig {
    //1.定义一个方法获得要管理的对象
    //2.添加 @Bean，表示当前方法的返回值是一个bean

    //简单类型注入 并且引入外部文件jdbc.properties
    @Value("jdbc.driver")
    private String driver;
    @Value("jdbc.url")
    private String url;
    @Value("jdbc.username")
    private String username;
    @Value("jdbc.password")
    private String password;

    //OrderDaoImpl 传入形参自动给你装配
    @Bean
    public DataSource dataSource(OrderDaoImpl orderDao){
        System.out.println(orderDao);
        DruidDataSource ds = new DruidDataSource();
        ds.setDriverClassName(driver);
        ds.setUrl(url);
        ds.setUsername(username);
        ds.setPassword(password);
        return ds;
    }
}
