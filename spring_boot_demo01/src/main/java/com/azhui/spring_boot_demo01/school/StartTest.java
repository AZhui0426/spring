package com.azhui.spring_boot_demo01.school;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Yang Zhongwei
 * @date 2022/2/8
 */
public class StartTest {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean/school.xml");
    }
}
