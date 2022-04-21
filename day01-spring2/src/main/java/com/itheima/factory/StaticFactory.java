package com.itheima.factory;

import com.itheima.service.UserService;

public class StaticFactory {

    public static UserService getBean(){
        UserService userService =  new UserService() {
            @Override
            public void save() {
                System.out.println("匿名内部类执行save...");
            }
        };
        return userService;
    }
}
