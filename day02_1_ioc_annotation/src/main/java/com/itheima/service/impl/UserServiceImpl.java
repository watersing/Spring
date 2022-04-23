package com.itheima.service.impl;

import com.itheima.service.UserService;
import org.springframework.stereotype.Component;

/**
 * UserServiceImpl  class
 *
 * @author lst
 * @version 1.0
 * @date 2022/4/22 23:30
 */
//@Component(value = "userService")
@Component("userService")
//@Component
public class UserServiceImpl implements UserService {
    @Override
    public void save() {

        System.out.println("UserServiceImpl save run ....");
    }




}
