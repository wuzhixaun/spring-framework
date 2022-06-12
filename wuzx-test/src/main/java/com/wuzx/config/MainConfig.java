package com.wuzx.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("com.wuzx")
@Configuration
public class MainConfig {


    public MainConfig() {
        System.out.println("MainConfig init");
    }


}
