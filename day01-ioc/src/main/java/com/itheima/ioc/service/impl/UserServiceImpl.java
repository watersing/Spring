package com.itheima.ioc.service.impl;

import com.itheima.ioc.dao.UserDao;
import com.itheima.ioc.dao.impl.UserDaoImpl;
import com.itheima.ioc.service.UserService;
import com.itheima.ioc.util.BeanFactory;
import org.junit.Test;

import java.util.ResourceBundle;
/*
    # 需要一个对象
    1. 刚开始: 直接创建
    2. 现在:  从容器中获取

    IOC : inversion of control 控制反转
    1. 控制 : 对象的控制权,就是对象的创建和销毁
    2. 反转 : 对象的控制权从开发者手里转换到容器中

    好处: 解耦
        当需求变动的时候,只需要修改配置即可,无需修改代码

    # ioc重要角色
    1. 工厂
    2. 配置文件
        被工厂所加载, 配置的内容将会被放到容器中
    3. bean
        1). 配置文件中记载的类
        2). 放到容器中的对象
        从容器中获取
 */
public class UserServiceImpl implements UserService {

    @Test
    @Override
    public void add() throws Exception {
        //1. 主动创建对象
//        UserDaoImpl userDao = new UserDaoImpl();
//        UserDaoImpl2 userDao = new UserDaoImpl2();

        //2. 面向接口编程 : 解耦
//        UserDao userDao = new UserDaoImpl();
//        UserDao userDao = new UserDaoImpl2();

        //3. 反射 + 配置文件 : 进一步解耦
//        ResourceBundle bundle = ResourceBundle.getBundle("data");
//        String userDaoClassName = bundle.getString("userDao");
//
//        Class<?> clazz = Class.forName(userDaoClassName);
//        UserDao userDao = (UserDao) clazz.newInstance();


        //4. 工厂模式 : 统一管理bean的创建
        UserDao userDao = (UserDao) BeanFactory.getBean("userDao");
        userDao.addUser();
    }
}
