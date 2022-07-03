package com.yuanh.factory;

import com.yuanh.dao.UserDao;
import com.yuanh.dao.impl.UserDaoImpl;
import org.springframework.beans.factory.FactoryBean;

public class UserDaoFactoryBean implements FactoryBean<UserDao> {
    //代替原始实列化中创建对象的方法
    public UserDao getObject() throws Exception {
        return new UserDaoImpl();
    }
    //你这个对象什么类型的
    public Class<?> getObjectType() {
        return UserDao.class;
    }
    //控制是否是单例的 true   非单例 false
    //通常不写 默认单列
    public boolean isSingleton() {
        return false;
    }
}
