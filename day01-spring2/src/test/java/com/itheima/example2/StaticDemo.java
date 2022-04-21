package com.itheima.example2;

public class StaticDemo {

    public static void main(String[] args) {
//        Person.speak();
       /*

            java类的生命周期
            1. 三个阶段:
                SOURCE ->       CLASS        -> RUNTIME
                源码              字节码             运行
                (.java代码)    (.class字节码)      (Class对象)
            2. static的执行时机
                1). 字节码被加载到内存中的时候, static随着加载而执行
                2). 字节码加载之后, 才会实例化
                结论: static先与对象产生,所以static无法调用对象
                    -> static与对象无关
                注意: 非静态的内容放在对象中,静态内容放在方法区,用类进行标记
        */
//        Person p = new Person();
        Person p = null;
        p.speak();
    }


}
