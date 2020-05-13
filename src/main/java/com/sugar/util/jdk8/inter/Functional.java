package com.sugar.util.jdk8.inter;

/**
 * @author: chensj
 * @Date: 2020/1/13 5:24 下午
 */
@FunctionalInterface
public interface Functional {
    /**
     * FunctionalInterface注释的接口只能有一个方法，限制函数式接口不能修改为普通的接口.
     * java.lang.Runnable接口 java.util.concurrent.Callable接口是两个最典型的函数式接口。
     * 用于显示转换成ladbma表达式。
     */
    void method();
}
