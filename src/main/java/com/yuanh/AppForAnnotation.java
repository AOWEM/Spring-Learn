package com.yuanh;

import com.yuanh.config.SpringConfig;
import com.yuanh.dao.BookDao;
import com.yuanh.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * 纯注解开发
 */
public class AppForAnnotation {
    public static void main(String[] args) {
        /**
         * AnnotationConfigApplicationContext 纯注解开发
         * 加载配置类
         */
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        System.out.println(bookDao);

        BookService bookService = (BookService) ctx.getBean(BookService.class);
        System.out.println(bookService);
    }
}
