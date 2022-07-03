package com.yuanh.factory;

import com.yuanh.dao.BookDao;
import com.yuanh.dao.OrderDao;
import com.yuanh.dao.impl.OrderDaoImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * bean的三种实列化
 * 静态工厂AppForInstanceBook
 */
public class OrderDaoFactory {
    public static OrderDao getOrderDao(){
        return new OrderDaoImpl();
    }
}
