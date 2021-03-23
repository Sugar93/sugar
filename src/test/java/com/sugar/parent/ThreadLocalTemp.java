package com.sugar.parent;

import java.text.SimpleDateFormat;
import java.util.Random;

/**
 * @author: chensj
 * @Date: 2020/6/22 9:34 下午
 */
public class ThreadLocalTemp implements Runnable {
    private static final ThreadLocal<SimpleDateFormat> format = ThreadLocal.withInitial(()->new SimpleDateFormat("yyyyMMdd"));

    public static void main(String[] args) throws InterruptedException {
        ThreadLocalTemp obj = new ThreadLocalTemp();
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(obj, ""+i);
            Thread.sleep(new Random().nextInt(1000));
            thread.start();
        }
    }
    @Override
    public void run() {
        System.out.println("ThreadName="+Thread.currentThread().getName()+"defalutFormat"+format.get().toPattern());
        try {
            Thread.sleep(new Random().nextInt(1000));
        }catch (Exception e){
            e.printStackTrace();
        }
        format.set(new SimpleDateFormat());
        System.out.println("ThreadName="+Thread.currentThread().getName()+"Format"+format.get().toPattern());
    }
}
