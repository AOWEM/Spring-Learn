package com.yuanh.service.impl;

import com.yuanh.dao.BookDao;
import com.yuanh.service.BookService;

public class BookServiceImpl implements BookService {
    //5.删除 业务层中使用的new的方式创建dao对象
    private BookDao bookDao;
    public void save(){

        System.out.println("book service save ...");
        bookDao.save();
    }

    //6.提供对应的set方法
    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }
}
