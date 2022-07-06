package com.yuanh.dao.impl;

import com.yuanh.dao.BookDao;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * 注解配置bean
 */

@Repository("bookDao2") //数据层的
public class BookDaoImpl2 implements BookDao {

    public void save(){
        System.out.println("book dao save ...2" );
    }
}
