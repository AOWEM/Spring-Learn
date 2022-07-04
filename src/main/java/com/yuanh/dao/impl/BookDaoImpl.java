package com.yuanh.dao.impl;

import com.yuanh.dao.BookDao;

/**
 * 2.在次基础上参与三种bean的实列化
 */
public class BookDaoImpl implements BookDao {
    //构造方法 spring创建bean的时候是，调构造的无参的
    //实列化bean构造方法（常用）
   /* public BookDaoImpl() {
        System.out.println("book dao constructor is running ....");
    }*/

    //setter依赖注入 简单类型
    /*private  int connetionNum;
    private String databaseName;*/
    //入口方法
    /*public void setConnetionNum(int connetionNum) {
        this.connetionNum = connetionNum;
    }
    //入口方法
    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }*/

   /* public void save() {
        System.out.println("book dao save ..."+databaseName +" ,"+ connetionNum);
    }*/

    //表示bean初始化 对应的操作
   /* public void init(){
        System.out.println("init.....");
    }

    //表示bean销毁前的操作
    public void destory(){
        System.out.println("destory.....");
    }*/

    /**
     * 依赖注入的4中方式
     * 简单方法
     */
    /*private  int connetionNum;
    private String databaseName;

    *//**
     * 简单方法 构造方法
     *//*
    public BookDaoImpl(int connetionNum, String databaseName) {
        this.connetionNum = connetionNum;
        this.databaseName = databaseName;
    }

    public void save() {
        System.out.println("book dao save ..."+databaseName +","+connetionNum);
    }*/

    /**
     * 依赖注入的自动装配
     */
    public void save() {
        System.out.println("book dao save ...");
    }
}
