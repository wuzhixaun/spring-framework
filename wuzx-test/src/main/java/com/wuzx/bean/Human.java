package com.wuzx.bean;

import org.springframework.stereotype.Component;

//@Component
public class Human {

    private String name;


    public Human(String name) {
        this.name = name;
    }


    public Human() {
        System.out.println("Human init");
    }
}
