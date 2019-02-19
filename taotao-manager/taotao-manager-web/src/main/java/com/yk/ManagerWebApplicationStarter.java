package com.yk.controller;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.yk.service*","com.yk.*"})
public class ManagerWebApplicationStarter {

    public static void main(String[] args) {

        SpringApplication.run(ManagerWebApplicationStarter.class, args);
    }
}
