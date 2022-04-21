package com.itheima.test;

import com.itheima.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/*
* # IOC重要角色
* 1. 工厂
*       1). BeanFactory  父接口
*       2). ApplicationContext  子接口
*       3). ClassPathXmlApplicationContext 实现类 (加载类路径下xml配置文件的工厂)
*       4). AnnotationConfigApplicationContext 实现类 (加载注解配置的工厂)
*       特点:
*           I. 会加载配置文件
*               a. properties文件 -> 解析 Properties(Map)/ ResourceBundle
*               b. xml文件  -> 解析 sax/dom (dom4j)
*               c. 注解   -> 解析 反射
*               语法不同, 解析方案不同
*           II. 访问容器的入口
*               Map<String,Object>
*
* 2. 配置
*       1). xml配置
*       2). 注解
*
* 3. bean
*       在xml/注解中配置
*       从容器中获取
*
* # 记录
* 1. 快捷键
*       1). ctrl + alt + u : 选中一个类, 查看这个类继承体系
*
* */
public class UserTest {

    @Test
    public void test01(){
        //2.加载配置文件
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
//        ApplicationContext ctx = new AnnotationConfigApplicationContext();
        //3.获取资源: 通过配置文件中的id
        UserService userService = (UserService) ctx.getBean("userService");
        userService.save();
    }
}
