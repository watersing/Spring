package com.itheima.service.impl;

import com.itheima.service.UserService;

/**
 * UserServiceImpl  class
 *
 * @author lst
 * @version 1.0
 * @date 2022/4/21 21:30
 */

public class UserServiceImpl2 implements UserService {
    public UserServiceImpl2(){
        System.out.println("UserServiceImpl2 create ...");
    }
    @Override
    public void save() {
        System.out.println("UserService save run 666....");

    }
    public void initMethod(){
        System.out.println("initMethod run ....");
    }

    public void destroyMethod(){
        System.out.println("destroyMethod run ....");
    }
}
