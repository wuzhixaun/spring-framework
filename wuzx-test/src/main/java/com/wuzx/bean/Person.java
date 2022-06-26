package com.wuzx.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;
import org.springframework.stereotype.Component;

/**
 * 实现xxxAware 注入相应的组件
 * 其实原理就是利用BeanPost
 */
//@Component
public class Person implements ApplicationContextAware, MessageSourceAware, InitializingBean {


    public Person() {
        System.out.println("创建person");
    }
    private String name;


    private ApplicationContext applicationContext;

    private MessageSource messageSource;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    @Override
    public void setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;
    }



    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("person afterPropertiesSet");
    }
}
