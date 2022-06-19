package com.wuzx.processor.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.SmartInstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

import java.lang.reflect.Constructor;

@Component
public class MySmartInstantiationAwareBeanPostProcessor implements SmartInstantiationAwareBeanPostProcessor {


    public MySmartInstantiationAwareBeanPostProcessor() {
        System.out.println("MySmartInstantiationAwareBeanPostProcessor...");
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("MySmartInstantiationAwareBeanPostProcessor postProcessBeforeInitialization");
        return SmartInstantiationAwareBeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("MySmartInstantiationAwareBeanPostProcessor postProcessAfterInitialization");
        return SmartInstantiationAwareBeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }

    @Override
    public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
        System.out.println("MySmartInstantiationAwareBeanPostProcessor postProcessBeforeInstantiation");
        return SmartInstantiationAwareBeanPostProcessor.super.postProcessBeforeInstantiation(beanClass, beanName);
    }

    @Override
    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
        System.out.println("MySmartInstantiationAwareBeanPostProcessor postProcessAfterInstantiation ==》beanName:" + beanName + "---" + bean);
        return SmartInstantiationAwareBeanPostProcessor.super.postProcessAfterInstantiation(bean, beanName);
    }

    @Override
    public PropertyValues postProcessProperties(PropertyValues pvs, Object bean, String beanName) throws BeansException {
        System.out.println("MySmartInstantiationAwareBeanPostProcessor postProcessProperties  ==》beanName:" + beanName + "---" + bean);
        return SmartInstantiationAwareBeanPostProcessor.super.postProcessProperties(pvs, bean, beanName);
    }

    // 预测bean的类型，最后一次改变组件类型
    @Override
    public Class<?> predictBeanType(Class<?> beanClass, String beanName) throws BeansException {
        System.out.println("MySmartInstantiationAwareBeanPostProcessor predictBeanType ==》beanName:" + beanName + "---" + beanClass);
        return SmartInstantiationAwareBeanPostProcessor.super.predictBeanType(beanClass, beanName);
    }

    // 返回我们要使用构造器列表
    @Override
    public Constructor<?>[] determineCandidateConstructors(Class<?> beanClass, String beanName) throws BeansException {
        System.out.println("MySmartInstantiationAwareBeanPostProcessor determineCandidateConstructors==》beanName:" + beanName + "---" + beanClass);
        return SmartInstantiationAwareBeanPostProcessor.super.determineCandidateConstructors(beanClass, beanName);
    }

    @Override
    public Object getEarlyBeanReference(Object bean, String beanName) throws BeansException {
        System.out.println("MySmartInstantiationAwareBeanPostProcessor getEarlyBeanReference==》beanName:" + beanName + "---" + bean);
        return SmartInstantiationAwareBeanPostProcessor.super.getEarlyBeanReference(bean, beanName);
    }
}
