package com.yuanh.service.impl;

import com.yuanh.dao.BookDao;
import com.yuanh.dao.UserDao;
import com.yuanh.service.BookService;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

//spring给你提供的bean生命周期 初始话和销毁方法 InitializingBean DisposableBean

/**
 * 依赖注入的四种方式setter注入
 * 1.引用类型对象
 */
public class BookServiceImpl implements BookService/* , InitializingBean, DisposableBean*/ {
    //5.删除 业务层中使用的new的方式创建dao对象
    /**
     * seter注入引入多个
     */
    private BookDao bookDao;
    private UserDao userDao;
    public void save(){

        System.out.println("book service save ...");
        bookDao.save();
        userDao.save();
    }

    //6.提供对应的set方法  setter注入方式 引用类型对象
    public void setBookDao(BookDao bookDao) {
        /*System.out.println("setBookDao .....");*/
        this.bookDao = bookDao;
    }
    //setter注入方式 引用类型对象
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

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
}
