package com.wujunyu.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.Arrays;

@SpringBootApplication
@MapperScan(value = "com.wujunyu.*.mapper")
@ComponentScan(value = "com.wujunyu")
public class UserApplication {
    public static void main(String[] args) {
         SpringApplication.run(UserApplication.class, args);
    }
}
