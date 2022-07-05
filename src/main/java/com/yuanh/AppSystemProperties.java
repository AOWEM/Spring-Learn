package com.yuanh;

import com.yuanh.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;


/**
 * 输出一下
 * 通过properties 配置的数据库
 * 中间我们给name注入了个数据
 */
public class AppSystemProperties {
    public static void main(String[] args) {
        //3.获取Ioc容易
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

//        DataSource dataSource = (DataSource) ctx.getBean("dataSource");
//
//        System.out.println(dataSource);
        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        bookDao.save();
    }
}
