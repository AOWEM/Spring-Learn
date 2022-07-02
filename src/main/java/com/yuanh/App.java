package com.yuanh;

import com.yuanh.dao.BookDao;
import com.yuanh.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        //3.获取Ioc容易
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        //4.获取bean 你xml id是啥名你就那啥名字  dao层的
       /* BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        //调用方法
        bookDao.save();*/

        //5.获取service的bean
        BookService bookService = (BookService) ctx.getBean("bookService");
        bookService.save();
    }
}
