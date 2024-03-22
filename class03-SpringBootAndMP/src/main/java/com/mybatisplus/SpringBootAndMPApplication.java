package com.mybatisplus;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.mybatisplus.mapper")
public class SpringBootAndMPApplication {
    public static void main(String[] args) {

        SpringApplication.run(SpringBootAndMPApplication.class, args);
    }
}
