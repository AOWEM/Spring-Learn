package com.yuanh.dao.impl;

import com.yuanh.dao.OrderDao;
import org.springframework.stereotype.Repository;

@Repository
public class OrderDaoImpl implements OrderDao {
    public void save(){
        System.out.println("Order dao save.....");
    }
}
