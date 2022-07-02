package com.yuanh;

import com.yuanh.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForName {
    public static void main(String[] args) {
        //3.获取Ioc容易
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        //5.获取service的bean  调用别名
        BookService bookService = (BookService) ctx.getBean("service");
        bookService.save();
    }
}
