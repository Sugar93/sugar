package com.sugar.common.annotation;

import org.springframework.stereotype.Component;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author: chensj
 * @Date: 2020/6/14 8:44 下午
 */
@Component
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface ZnsService {
    Class<?> cls();
    String version() default "1.0";
}
