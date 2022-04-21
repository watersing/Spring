package com.itheima.example;

public class Demo {

    public static void main(String[] args) {
        /*
            实现一个东西
            1. 硬编码 : 写代码
            2. 配置方式
                1). xml配置
                2). 注解配置
                ...
         */
        //创建了一个Animal接口的实现类对象
        Animal a = new Animal() {
            @Override
            public void shout() {
                System.out.println("汪汪叫");
            }
        };
    }
}
