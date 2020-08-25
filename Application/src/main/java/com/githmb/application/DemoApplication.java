package com.githmb.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static develon.spring.log.LoggerKt.getLog;

@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {
        getLog().d("你好");
        SpringApplication.run(DemoApplication.class, args);
    }
}
