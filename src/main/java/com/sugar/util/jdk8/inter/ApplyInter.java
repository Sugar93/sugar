package com.sugar.util.jdk8.inter;

/**
 * @author: chensj
 * @Date: 2020/1/13 5:37 下午
 * 函数型接口，有返回，有入参
 */
@FunctionalInterface
public interface ApplyInter<R,T> {
    T apply(R r);
}
