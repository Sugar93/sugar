package com.sugar.controller;

import com.sugar.util.RedisUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author: chensj
 * @Date: 2020/5/13 3:21 下午
 */
@RestController
@RequestMapping("/redis")
public class RedisController {
    private static int time = 60;
    @Resource
    private RedisUtil redisUtil;

    @RequestMapping("/set")
    public void redisSet(String key, String value){
        redisUtil.set(key, value, -1);
    }

    @RequestMapping("/get")
    public Object redisGet(String key){
        return redisUtil.get(key);
    }
}
