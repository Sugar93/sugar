package com.sugar.temp;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author: chensj
 * @Date: 2020/6/8 9:41 下午
 */
public class MyImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        System.out.println("111+"+annotationMetadata.getClassName());
        return new String[]{"com.toby.register.bean.Colour"};
    }
}
