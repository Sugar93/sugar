package com.sugar.util.jdk8.inter;

/**
 * @author: chensj
 * @Date: 2020/1/13 5:47 下午
 */
@FunctionalInterface
public interface BooleanInter<T> {
    boolean test(T t);
}
