package com.itheima.service.impl;


import com.itheima.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServiceImplTest {

    @Test
    public  void  testSave(){
        //1.构建容器对象-加载class类路径下的xml资源
        ApplicationContext ctx = new ClassPathXmlApplicationContext("application-intro.xml");
        //2.获取bean对象,入参是bean的名称，也就是xml配置bean下id的属性值
        /*UserService userService = (UserService) ctx.getBean("userService");
        UserService userService2 = (UserService) ctx.getBean("userService");*/


        UserService userService = (UserService) ctx.getBean("userService");
        UserService userService2 = (UserService) ctx.getBean("userService1");
        System.out.println(userService2==userService);
        //调用
        userService.save();

    }

    @Test
    public  void  test2(){
        //1.构建容器对象-加载class类路径下的xml资源
        ApplicationContext ctx = new ClassPathXmlApplicationContext("application-intro.xml");



        UserService userService = (UserService) ctx.getBean("userService");
        UserService userService2 = (UserService) ctx.getBean("userService2");
        System.out.println(userService2==userService);
        //调用
        userService.save();

    }
    @Test
    public void testLifeCycle(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("application-lifecycle.xml");

        UserService userService = (UserService) ctx.getBean("userService");
        UserService userService2 = (UserService) ctx.getBean("userService");
        userService.save();
//        (ClassPathXmlApplicationContext) ctx./*/

        ( (ClassPathXmlApplicationContext) ctx).close();
    }
}