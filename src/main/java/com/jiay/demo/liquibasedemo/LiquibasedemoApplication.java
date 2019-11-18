package com.jiay.demo.liquibasedemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.jiay.demo.liquibasedemo.mapper")
public class LiquibasedemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(LiquibasedemoApplication.class, args);
    }

}
