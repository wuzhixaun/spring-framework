package com.wuzx.processor.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class MyInstantiationAwareBeanPostProcessor implements InstantiationAwareBeanPostProcessor {

    public MyInstantiationAwareBeanPostProcessor() {
        System.out.println("MyInstantiationAwareBeanPostProcessor");
    }

    // 初始化之前进行后置处理，如果我们自己创建了对象，则Spring不会创建
    @Override
    public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
        System.out.println(" MyInstantiationAwareBeanPostProcessor postProcessBeforeInstantiation");
        return InstantiationAwareBeanPostProcessor.super.postProcessBeforeInstantiation(beanClass, beanName);
    }

    @Override
    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
        System.out.println(" MyInstantiationAwareBeanPostProcessor postProcessAfterInstantiation");
        return InstantiationAwareBeanPostProcessor.super.postProcessAfterInstantiation(bean, beanName);
    }

    // 可以利用这个方法解析自定义注解
    @Override
    public PropertyValues postProcessProperties(PropertyValues pvs, Object bean, String beanName) throws BeansException {
        System.out.println(" MyInstantiationAwareBeanPostProcessor postProcessProperties");
        return InstantiationAwareBeanPostProcessor.super.postProcessProperties(pvs, bean, beanName);
    }
}
