package com.sugar.util.jdk8.inter;

/**
 * @author: chensj
 * @Date: 2020/1/13 5:41 下午
 * 供给型 有入参，无出参 注重过程
 */
@FunctionalInterface
public interface SupplierInter<T> {
    T supplier();
}
