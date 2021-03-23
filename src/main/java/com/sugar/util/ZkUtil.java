package com.sugar.util;

import com.sugar.model.ZkServerConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


/**
 * @author: chensj
 * @Date: 2020/6/14 8:00 下午
 */
@Component
public class ZkUtil {
    private static Logger LOGGER = LoggerFactory.getLogger(ZkUtil.class);
//    private CuratorFramework client = null;
//    private ZkClient zkClient;
    @Autowired
    private ZkServerConfiguration zkServerConfiguration;
    public void init(){
//        if (client != null){
//            return;
//        }
    }
    //重试机制
//    RetryPolicy retryPolicy = new ExponentialBackoffRetry(1000, 3);
}
