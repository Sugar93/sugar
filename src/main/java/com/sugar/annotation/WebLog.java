package com.sugar.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author: chensj
 * @Date: 2020/6/8 10:16 下午
 */
@Retention(RetentionPolicy.RUNTIME)//运行时注解
@Target({ElementType.METHOD})//用于哪里
@Documented//注解是否将包含在 JavaDoc 中
public @interface WebLog {
    String desc() default "";
}
