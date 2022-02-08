package com.azhui.spring_boot_demo01.importtest;

import importclass.MyClass02;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author Yang Zhongwei
 * @date 2022/2/7
 */
//@Configuration
@Import(value = {MyClass.class, MyClass02.class})
public class ImportDemo {
}
