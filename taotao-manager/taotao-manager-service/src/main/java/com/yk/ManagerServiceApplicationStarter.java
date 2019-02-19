package com.yk;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan("com.yk.mapper")
public class ManagerServiceApplicationStarter {

    public static void main(String[] args) {

        SpringApplication.run(ManagerServiceApplicationStarter.class, args);
    }
}
