package com.amiya.springbootdemoproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackageClasses = "com.amiya.springbootdemoproject.controller")
public class SpringbootdemoprojectApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootdemoprojectApplication.class, args);
    }

}
