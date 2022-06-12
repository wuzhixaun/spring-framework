package com.wuzx;

import com.wuzx.bean.Cat;
import com.wuzx.bean.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class XmlMainTest {


    public static void main1(String[] args) {
        final ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        final Person person = context.getBean(Person.class);
        System.out.println(person);
    }

	public static void main(String[] args) {
//        final ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//        final Person person = context.getBean(Person.class);
//        System.out.println(person);

        final ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans2.xml");
        final Cat cat = context.getBean(Cat.class);
        System.out.println(cat);
    }
}
