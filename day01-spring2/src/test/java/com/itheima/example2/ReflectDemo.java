package com.itheima.example2;

import java.lang.reflect.Method;

public class ReflectDemo {

    public static void main(String[] args) throws Exception {
        /*
        *  反射: 运行时操作类
        *  1. java类的生命周期
        *       SOURCE      ->  CLASS       ->  RUNTIME
        *       (.java代码)     (.class字节码)   (Class对象)
        *
        *  2. 运行时的类 -> Class对象
        *       1). Class对象的创建: 是字节码被类加载器加载到内存时,由JVM创建的
        *       2). 开发者只能获取Class对象,而无法创建
        *           有三种获取方式
        *  3. 操作 (类有什么东西,我们就能操作什么东西)
        *       1). 构造器  -> 创建对象
        *       2). 方法   -> 调用
        *       3). 属性   -> 取值/复制==赋值
        *       4). ...
        * */
        Class<?> clazz = Class.forName("com.itheima.example2.Person");
        //描述方法名,以及参数列表
//        clazz.getMethod("speak",String.class,int.class);
        //public修饰
        Method speak = clazz.getMethod("speak");
        /*
            Person p = null;
            p.speak();
         */
        speak.invoke(null);
    }
}
