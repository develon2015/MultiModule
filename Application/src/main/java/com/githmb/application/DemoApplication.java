package com.githmb.application;

import develon.spring.emcat.EventListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static develon.spring.log.LoggerKt.getLog;

@SpringBootApplication(scanBasePackageClasses = { DemoApplication.class, EventListener.class })
public class DemoApplication {
    public static void main(String[] args) {
        getLog().d("你好");
        SpringApplication.run(DemoApplication.class, args);
    }
}
