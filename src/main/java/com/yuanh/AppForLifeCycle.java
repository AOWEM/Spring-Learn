package com.yuanh;

import com.yuanh.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * bean的生命周期
 */
public class AppForLifeCycle {
    public static void main(String[] args) {
        //3.获取Ioc容易
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        //注册容器关闭钩子  registerShutdownHook可以在任何位子
//        ctx.registerShutdownHook();

        //4.获取bean 你xml id是啥名你就那啥名字  dao层的
        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        //调用方法
        bookDao.save();
        //关闭容器 强制性的 不能在任何位子，放开开头没有创建前就关闭执行不了下边的方法
        ctx.close();


    }
}
