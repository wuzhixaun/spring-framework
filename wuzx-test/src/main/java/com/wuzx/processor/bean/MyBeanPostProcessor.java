package com.wuzx.processor.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;


/**
 * bean组件的后置处理器
 */
@Component
public class MyBeanPostProcessor implements BeanPostProcessor {


    public MyBeanPostProcessor() {
        System.out.println("MyBeanPostProcessor...");
    }


    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("MyBeanPostProcessor postProcessBeforeInitialization");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("MyBeanPostProcessor postProcessAfterInitialization");
        return bean;
    }
}
