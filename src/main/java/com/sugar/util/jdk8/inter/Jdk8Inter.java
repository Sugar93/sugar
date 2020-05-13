package com.sugar.util.jdk8.inter;

/**
 * @author: chensj
 * @Date: 2020/1/13 5:13 下午
 */
public interface Jdk8Inter {
    /**
     * @throws Exception
     */
    void test1() throws Exception;

    /**
     * 1.8新特性，支持静态方法和默认方法
     * @param string
     * @throws Exception
     */
    default void log(String string) throws Exception{
        System.out.println("log::"+string);
    }
    static boolean isNull(String string){
        if (string == null){
            return true;
        }
        return false;
    }
}
