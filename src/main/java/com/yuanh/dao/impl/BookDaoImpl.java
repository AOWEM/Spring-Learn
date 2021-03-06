package com.yuanh.dao.impl;

import com.yuanh.dao.BookDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.*;

/**
 * 注解配置bean
 */
//@Component("bookDao")
//@Controller //表现层
@Repository("bookDao") //数据层的
//@Scope("prototype") //改为非单列
@Scope("singleton") //改为单列
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
    /*public void save() {
        System.out.println("book dao save ...");
    }*/


    /**
     * 集合注入
     */
   /* private int[] array;

    private List<String> list;

    private Set<String> set;

    private Map<String,String> map;

    private Properties properties;




    public void setArray(int[] array) {
        this.array = array;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }




    public void save() {
        System.out.println("book dao save ...");

        System.out.println("遍历数组:" + Arrays.toString(array));

        System.out.println("遍历List" + list);

        System.out.println("遍历Set" + set);

        System.out.println("遍历Map" + map);

        System.out.println("遍历Properties" + properties);
    }*/

    /*private String name;

    public void setName(String name) {
        this.name = name;
    }
    public void save(){
        System.out.println("book dao save ..." +name);
    }*/


    /*容器*/
    /*public void save(){
        System.out.println("book dao save ..." );
    }*/

    /**
     * 生命周期注解
     * 构造方法后运行
     * @PostConstruct
     */
    /*@PostConstruct
    public void init(){
        System.out.println("init  ..." );
    }*/
    /**
     * 生命周期注解
     * 彻底销毁后运行的方法
     * @PreDestroy
     */
    /*@PreDestroy
    public void destroy(){
        System.out.println("destroy ..." );
    }*/

    /**
     * 依赖注入的自动装配
     * 简单类型
     * @Value("yuanh") 简单类型的赋值  加载了外部配置文件可以动态配置数据
     */
//    @Value("yuanh")
    @Value("${name}")
    private String name;
    public void save(){
        System.out.println("book dao save ..." +name);
    }
}
