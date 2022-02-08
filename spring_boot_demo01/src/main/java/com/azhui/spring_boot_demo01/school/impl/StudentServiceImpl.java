package com.azhui.spring_boot_demo01.school.impl;

import com.azhui.spring_boot_demo01.school.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.DependsOn;

/**
 * @author Yang Zhongwei
 * @date 2022/2/8
 */
public class StudentServiceImpl implements StudentService {

    private final static Logger log = LoggerFactory.getLogger(StudentServiceImpl.class);

    public StudentServiceImpl() {
        log.info("StudentServiceImpl创建bean对象进入IOC容器");
    }
}
