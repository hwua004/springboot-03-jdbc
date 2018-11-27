package com.hwua.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@MapperScan(basePackages="com.hwua.springboot.dao")
public class Springboot03JdbcApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot03JdbcApplication.class, args);
    }
}
