package com.daniel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.Cacheable;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.daniel.mapper")
@Cacheable
public class MainApp {
    public static void main(String[] args) {
        SpringApplication.run(MainApp.class, args);
    }
}
