package com.itheima.ioc.util;

import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;

public class BeanFactory {

    //1、事先存储容器
    private static Map<String, Object> map = new HashMap<>();
    //2、加载配置文件
    static {
        ResourceBundle bundle = ResourceBundle.getBundle("data");
        try {
            Enumeration<?> enumeration = bundle.getKeys();
            while (enumeration.hasMoreElements()) {
                String key = (String) enumeration.nextElement();
                String value = (String) bundle.getString(key);
                //3、实例化bean
                Object beanObject = Class.forName(value).newInstance();
                //4、放入容器
                map.put(key,beanObject);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    //5、公共获得bean
    public static Object getBean(String calssName){
        return map.get(calssName);
    }
}
