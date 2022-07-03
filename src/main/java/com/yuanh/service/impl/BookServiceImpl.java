package com.yuanh.service.impl;

import com.yuanh.dao.BookDao;
import com.yuanh.service.BookService;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

//spring给你提供的bean生命周期 初始话和销毁方法 InitializingBean DisposableBean
public class BookServiceImpl implements BookService , InitializingBean, DisposableBean {
    //5.删除 业务层中使用的new的方式创建dao对象
    private BookDao bookDao;
    public void save(){

        System.out.println("book service save ...");
        bookDao.save();
    }

    //6.提供对应的set方法
    public void setBookDao(BookDao bookDao) {
        System.out.println("setBookDao .....");
        this.bookDao = bookDao;
    }

    //spring给你提供的bean生命周期 初始话和销毁方法
    public void destroy() throws Exception {
        System.out.println("service destroy ....");
    }

    //spring给你提供的bean生命周期 初始话和销毁方法
    //当属性设置完了才执行
    public void afterPropertiesSet() throws Exception {
        System.out.println("service init ....");
    }
}
