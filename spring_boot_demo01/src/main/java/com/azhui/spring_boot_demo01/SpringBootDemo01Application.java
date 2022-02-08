package com.azhui.spring_boot_demo01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
//加载XML管理bean
//@ImportResource(value = {"classpath:bean/school.xml"})
public class SpringBootDemo01Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemo01Application.class, args);
    }

}
