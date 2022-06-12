package com.wuzx.processor.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.support.MergedBeanDefinitionPostProcessor;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.stereotype.Component;

@Component
public class MyMergedBeanDefinitionPostProcessor implements MergedBeanDefinitionPostProcessor {


    public MyMergedBeanDefinitionPostProcessor() {
        System.out.println("MyMergedBeanDefinitionPostProcessor...");
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("MyMergedBeanDefinitionPostProcessor postProcessBeforeInitialization");
        return MergedBeanDefinitionPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("MyMergedBeanDefinitionPostProcessor postProcessAfterInitialization");
        return MergedBeanDefinitionPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }

    @Override
    public void postProcessMergedBeanDefinition(RootBeanDefinition beanDefinition, Class<?> beanType, String beanName) {
        System.out.println("MyMergedBeanDefinitionPostProcessor postProcessMergedBeanDefinition");
    }

    @Override
    public void resetBeanDefinition(String beanName) {
        System.out.println("MyMergedBeanDefinitionPostProcessor resetBeanDefinition");
        MergedBeanDefinitionPostProcessor.super.resetBeanDefinition(beanName);
    }
}
