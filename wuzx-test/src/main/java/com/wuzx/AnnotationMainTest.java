package com.wuzx;

import com.wuzx.bean.Person;
import com.wuzx.config.MainConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class AnnotationMainTest {


	public static void main(String[] args) {
        final AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        final Person person = annotationConfigApplicationContext.getBean(Person.class);
        System.out.println(person);
    }
}
