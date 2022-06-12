package com.wuzx.processor.factory;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.stereotype.Component;


/**
 * BeanFactoryP工厂的后置处理器，只不过是BeanFactoryPostProcessor 的子接口
 */
@Component
public class MyBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {


    public MyBeanDefinitionRegistryPostProcessor() {
        System.out.println("MyBeanDefinitionRegistryPostProcessor....");
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        //
        System.out.println("MyBeanDefinitionRegistryPostProcessor postProcessBeanFactory");
    }

    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
        // 增强bean的定义信息，比如自己注册的组件
        System.out.println("MyBeanDefinitionRegistryPostProcessor postProcessBeanDefinitionRegistry");
    }
}
