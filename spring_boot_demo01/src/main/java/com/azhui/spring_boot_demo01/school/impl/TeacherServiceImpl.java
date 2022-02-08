package com.azhui.spring_boot_demo01.school.impl;

import com.azhui.spring_boot_demo01.school.TeacherService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Yang Zhongwei
 * @date 2022/2/8
 */
public class TeacherServiceImpl implements TeacherService {

    private final static Logger log = LoggerFactory.getLogger(TeacherServiceImpl.class);

    public TeacherServiceImpl() {
        log.info("TeacherServiceImpl创建bean对象进入IOC容器：{}", this);
    }
}
