package com.yuanh.dao.impl;

import com.yuanh.dao.BookDao;

/**
 * 2.在次基础上参与三种bean的实列化
 */
public class BookDaoImpl implements BookDao {
    //构造方法 spring创建bean的时候是，调构造的无参的
    //实列化bean构造方法（常用）
    public BookDaoImpl() {
        System.out.println("book dao constructor is running ....");
    }

    public void save() {
        System.out.println("book dao save ...");
    }
}
