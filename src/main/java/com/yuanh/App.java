package com.yuanh;

import com.alibaba.druid.pool.DruidDataSource;
import com.yuanh.config.SpringConfig;
import com.yuanh.dao.BookDao;
import com.yuanh.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import javax.sql.DataSource;


/**
 * 管理第三方资源管理器
 */
public class App {
    public static void main(String[] args) {
        //3.获取Ioc容易
//        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        //4.获取bean 你xml id是啥名你就那啥名字  dao层的
       /* BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        //调用方法
        bookDao.save();*/

        //5.获取service的bean
        /*BookService bookService = (BookService) ctx.getBean("bookService");
        bookService.save();*/
        /*
        * javax.sql.DataSource 这个包
        * */
       /* DataSource dataSource = (DataSource) ctx.getBean("dataSource");

        System.out.println(dataSource);*/

        //1.加载类路径下的配置文件
//        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        //2.从文件系统下加载配置文件 绝对路径加载
//        ApplicationContext ctx = new FileSystemXmlApplicationContext("D:\\Java project\\JavaWebProjects\\Spring\\spring-demo\\src\\main\\resources\\applicationContext.xml");
        //1.第一种获取bean的方法
//        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        //2.第二 种获取bean的方法
        /*BookDao bookDao = ctx.getBean("bookDao", BookDao.class);
        bookDao.save();*/

        /**
         * 注解开发
         */
        /*BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        System.out.println(bookDao);

        BookService bookService = (BookService) ctx.getBean(BookService.class);
        System.out.println(bookService);*/

        /**
         * bean 管理
         */
        /*AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDao bookDao1 = ctx.getBean(BookDao.class);
        BookDao bookDao2 = ctx.getBean(BookDao.class);
        System.out.println(bookDao1);
        System.out.println(bookDao2);
        ctx.close();*/

        /**
         * 注解开发依赖注入
         */
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookService bookService = ctx.getBean(BookService.class);
        bookService.save();
    }
}
