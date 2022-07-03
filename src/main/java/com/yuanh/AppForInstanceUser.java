package com.yuanh;

import com.yuanh.dao.OrderDao;
import com.yuanh.dao.UserDao;
import com.yuanh.factory.UserDaoFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * bean的三种实列化
 * 实列化工厂
 */
public class AppForInstanceUser {
    public static void main(String[] args) {
        /*//创建实列化工厂对象
        UserDaoFactory userDaoFactory = new UserDaoFactory();
        //通过实列化工厂对象创建对象
        UserDao userDao = userDaoFactory.getUserDao();
        userDao.save();*/




        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        UserDao userDao = (UserDao) ctx.getBean("userDao");
        UserDao userDao1 = (UserDao) ctx.getBean("userDao");
        UserDao userDao2 = (UserDao) ctx.getBean("userDao");

        System.out.println(userDao1);
        System.out.println(userDao2);

        userDao.save();
    }
}
