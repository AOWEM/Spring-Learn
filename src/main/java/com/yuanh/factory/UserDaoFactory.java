package com.yuanh.factory;

import com.yuanh.dao.OrderDao;
import com.yuanh.dao.UserDao;
import com.yuanh.dao.impl.OrderDaoImpl;
import com.yuanh.dao.impl.UserDaoImpl;

/**
 * bean的三种实列化
 * 实列化工厂
 */
public class UserDaoFactory {
    public  UserDao getUserDao(){
        return new UserDaoImpl();
    }
}
