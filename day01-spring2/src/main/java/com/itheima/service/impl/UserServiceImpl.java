package com.itheima.service.impl;

import com.itheima.service.UserService;

public class UserServiceImpl implements UserService {
    public UserServiceImpl(){
        System.out.println("UserServiceImpl 创建了...");
    }
    public void save() {
        System.out.println("user service running...");
    }

    //public 无参无返回的方法
    public void init(){
        System.out.println("UserServiceImpl init");
    }

    public void destroy(){
        System.out.println("UserServiceImpl destroy");
    }
}
