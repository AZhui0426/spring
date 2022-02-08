package com.azhui.spring_boot_demo01.importtest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author Yang Zhongwei
 * @date 2022/2/7
 */
public class MyClass implements ImportSelector {

    private final static Logger log = LoggerFactory.getLogger(MyClass.class);

    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        log.info("importSelector执行");
        return new String[0];
    }
}
