package com.itheima.test;

import com.itheima.dao.impl.UserDaoImpl;
import com.itheima.service.UserService;
import com.itheima.service.impl.UserServiceImpl2;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/*
    # spring内部的东西
    1. 工厂和容器
    2. 制定了配置规范
        1). xml配置
        2). 注解

    # 开发者使用spring的ioc功能
    1. 配置 (主要!!!)
    2. 获取bean

    # 查看报错信息
    1. 异常描述
    2. 异常发生位置
 */
public class UserTest {

    @Test
    public void test01(){

        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        /*
        * 异常描述:
        *   NoSuchBeanDefinitionException: No bean named 'userService3' available
        *       没有此Bean定义异常 : 没有名为userService3的bean
        * 异常位置:  当前行
        * */
        UserService userService = (UserService) ctx.getBean("userService");
        userService.save();
    }

    @Test
    public void test02(){

        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) ctx.getBean("userService");
        UserService userService2 = (UserService) ctx.getBean("userService2");
//        System.out.println(userService);
//        System.out.println(userService2);

        //本来,程序运行结束,工厂就会销毁的,但是jvm关闭太快, 而bean销毁中的打印需要时间,来不及执行
        // 所以,为了让大家看到销毁方法中的打印内容, 现在手动关闭工厂(开发的时候不需要这么干)
        ctx.close();
    }

    @Test
    public void test03(){

        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) ctx.getBean("userService10");

        userService.save();
    }
}
