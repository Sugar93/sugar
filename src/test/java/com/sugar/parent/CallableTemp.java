package com.sugar.parent;

import java.util.Date;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author: chensj
 * @Date: 2020/6/22 9:51 下午
 */
public class CallableTemp implements Callable {
    private String command;
    public CallableTemp(String command){
        this.command = command;
    }
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CallableTemp callableTemp = new CallableTemp("");
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future submit = executorService.submit(callableTemp);
        System.out.println(submit.get());
    }
    @Override
    public Object call() throws Exception {
        System.out.println(Thread.currentThread().getName()+" start "+new Date());
        Thread.sleep(5000);
        System.out.println(Thread.currentThread().getName()+" end "+new Date());
        return "返回值";
    }

    @Override
    public String toString() {
        return "CallableTemp{" +
                "command='" + command + '\'' +
                '}';
    }
}
