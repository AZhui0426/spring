package com.azhui.spring_boot_demo01.school.impl;

import com.azhui.spring_boot_demo01.school.SchoolService;
import com.azhui.spring_boot_demo01.school.StudentService;
import com.azhui.spring_boot_demo01.school.TeacherService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Yang Zhongwei
 * @date 2022/2/8
 */
public class SchoolServiceImpl implements SchoolService {

    private final static Logger log = LoggerFactory.getLogger(SchoolServiceImpl.class);

    private TeacherService teacherService;
    private StudentService studentService;

    public SchoolServiceImpl(TeacherService teacherService, StudentService studentService) {
        log.info("构造函数参数teacherService：{}", teacherService);
        this.teacherService = teacherService;
        log.info("构造函数参数studentService：{}", studentService);
        this.studentService = studentService;
    }
}
