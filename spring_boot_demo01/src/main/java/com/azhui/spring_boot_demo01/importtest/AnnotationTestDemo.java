package com.azhui.spring_boot_demo01.importtest;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Yang Zhongwei
 * @date 2022/2/7
 */
public class AnnotationTestDemo {
    public static void main(String[] args) {
        //这里的参数代表要做操作的类
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ImportDemo.class);
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String name : beanDefinitionNames) {
            System.out.println(name);
        }
    }
}
