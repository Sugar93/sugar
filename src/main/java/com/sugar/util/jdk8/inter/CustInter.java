package com.sugar.util.jdk8.inter;

/**
 * @author: chensj
 * @Date: 2020/1/13 5:45 下午
 * 消费型 有入参，无出参
 */
@FunctionalInterface
public interface CustInter<T> {
    void accept(T t);
}
