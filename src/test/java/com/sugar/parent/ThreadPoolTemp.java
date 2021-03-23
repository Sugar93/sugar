package com.sugar.parent;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author: chensj
 * @Date: 2020/6/22 10:09 下午
 */
public class ThreadPoolTemp {
    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(3,6,1L,
                TimeUnit.SECONDS,new ArrayBlockingQueue<>(100), new ThreadPoolExecutor.AbortPolicy());
        for (int i = 0; i < 10; i++) {
            threadPoolExecutor.submit(new CallableTemp(""+i));
        }
        threadPoolExecutor.shutdown();
        System.out.println("over");
    }
}
