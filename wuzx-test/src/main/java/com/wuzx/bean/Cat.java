package com.wuzx.bean;


import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
public class Cat implements InitializingBean {

    public Cat() {
        System.out.println("cat 创建");
    }

    private String name;

    public String getName() {
        return name;
    }

    /**
     * 自动赋值
     * @param name
     */
    @Value("${JAVA_HOME}")
    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }


    // 设置属性之后，
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Cat afterPropertiesSet...");
    }


    public void myInitMethod() {
        System.out.println("我的自定义方法");
    }
}
