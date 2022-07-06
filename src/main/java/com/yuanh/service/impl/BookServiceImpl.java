package com.yuanh.service.impl;

import com.yuanh.dao.BookDao;
import com.yuanh.dao.UserDao;
import com.yuanh.service.BookService;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//spring给你提供的bean生命周期 初始话和销毁方法 InitializingBean DisposableBean

/**
 * 注解bean
 */
//@Component
@Service //业务成的bean注解
public class BookServiceImpl implements BookService/* , InitializingBean, DisposableBean*/ {
    //5.删除 业务层中使用的new的方式创建dao对象
    /**
     * seter注入引入多个
     */
    /*private BookDao bookDao;*/
    /*private UserDao userDao;*/
    /*public void save(){

        System.out.println("book service save ...");
        bookDao.save();
        userDao.save();
    }*/

    //6.提供对应的set方法  setter注入方式 引用类型对象
    /*public void setBookDao(BookDao bookDao) {
        *//*System.out.println("setBookDao .....");*//*
        this.bookDao = bookDao;
    }*/
    //setter注入方式 引用类型对象
    /*public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }*/

    //spring给你提供的bean生命周期 初始话和销毁方法
   /* public void destroy() throws Exception {
        System.out.println("service destroy ....");
    }
*/
    //spring给你提供的bean生命周期 初始话和销毁方法
    //当属性设置完了才执行
   /* public void afterPropertiesSet() throws Exception {
        System.out.println("service init ....");
    }*/


    /**
     * 依赖注入的4中方式
     * 构造方法
     */
   /* private BookDao bookDao;
    private UserDao userDao;

    //构造方法注入   用的形参的名字 bookDao  (BookDao bookDao)
    *//*public BookServiceImpl(BookDao bookDao) {
        this.bookDao = bookDao;
    }*//*
    //构造方法注入   用的形参的名字 (BookDao bookDao, UserDao userDao)
    public BookServiceImpl(BookDao bookDao, UserDao userDao) {
        this.bookDao = bookDao;
        this.userDao = userDao;
    }

    public void save() {
        System.out.println("book service save ...");
        bookDao.save();
        userDao.save();
    }*/


    /**
     * 依赖注入的自动装配
     * @Autowired 自动装配 按类型
     * Autowired 属于暴力反射 可以不写set方法
     * Qualifier 注解开启指定bean装配
     */
    @Autowired
    @Qualifier("bookDao2")
    private BookDao bookDao;



    public void save() {
        System.out.println("book service save ...");
        bookDao.save();
    }
}


