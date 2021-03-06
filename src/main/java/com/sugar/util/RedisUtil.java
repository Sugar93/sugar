package com.sugar.util;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * @author: chensj
 * @Date: 2020/5/13 11:25 上午
 */
@Component
public class RedisUtil {

    @Resource
    private RedisTemplate<String,Object> redisTemplate;

    public RedisUtil(RedisTemplate redisTemplate) {
        //解决乱码问题
        RedisSerializer stringSerializer = new StringRedisSerializer();
        redisTemplate.setKeySerializer(stringSerializer);
        redisTemplate.setValueSerializer(stringSerializer);
        redisTemplate.setHashKeySerializer(stringSerializer);
        this.redisTemplate = redisTemplate;
    }

    /**
     * 设置失效时间
     * @param key
     * @param time
     * @return
     */
    public boolean expire(String key, long time){
        try {
            if (time>0){
                redisTemplate.expire(key, time, TimeUnit.SECONDS);
            }
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    /**
     * 根据key获取失效时间
     * @param key
     * @return
     */
    public long getExpire(String key){
        return redisTemplate.getExpire(key);
    }

    /**
     * 判断key是否存在
     * @param key
     * @return
     */
    public boolean hasKey(String key){
        try {
            return redisTemplate.hasKey(key);
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    /**
     * 删除缓存
     * @param key
     */
    @SuppressWarnings("unchecked")
    public void delKey(String ... key){
        if (key == null || key.length == 0){
            return;
        }
        if (key.length == 1){
            redisTemplate.delete(key[0]);
        }else {
            redisTemplate.delete(CollectionUtils.arrayToList(key));
        }
    }

    /**
     * 普通缓存值获取
     * @param key
     * @return
     */
    public Object get(String key){
        return key != null?redisTemplate.opsForValue().get(key):null;
    }

    /**
     * 缓存写入
     * @param key
     * @param value
     * @return
     */
    public boolean set(String key, Object value, long time){
        try {
            if (time>0){
                redisTemplate.opsForValue().set(key, value, time);
                return true;
            }
            redisTemplate.opsForValue().set(key, value);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }
    /**
     * 递增
     * @param key 键
     * @param delta 要增加几(大于0)
     * @return
     */
    public long incr(String key, long delta){
        if(delta<0){
            throw new RuntimeException("递增因子必须大于0");
        }
        return redisTemplate.opsForValue().increment(key, delta);
    }

    /**
     * 递减
     * @param key 键
     * @param delta 要减少几(小于0)
     * @return
     */
    public long decr(String key, long delta){
        if(delta<0){
            throw new RuntimeException("递减因子必须大于0");
        }
        return redisTemplate.opsForValue().increment(key, -delta);
    }

    /**
     * hash获取
     * @param key
     * @param item
     * @return
     */
    public Object hget(String key, String item){
        return redisTemplate.opsForHash().get(key, item);
    }

    /**
     * 获取key对应的所有键值
     * @param key
     * @return
     */
    public Map<Object, Object> hmget(String key){
        return redisTemplate.opsForHash().entries(key);
    }

    /**
     * HashSet
     * @param key 键
     * @param map 对应多个键值
     * @return true 成功 false 失败
     */
    public boolean hmset(String key, Map<String,Object> map, long time){
        try {
            redisTemplate.opsForHash().putAll(key, map);
            if (time>0){
                expire(key, time);
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * hash存值
     * @param key
     * @param item
     * @param value
     * @return
     */
    public boolean hset(String key, String item, Object value, long time){
        try {
            redisTemplate.opsForHash().put(key, item, value);
            if (time > 0){
                expire(key, time);
            }
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }
    /**
     * 删除hash表中的值
     * @param key 键 不能为null
     * @param item 项 可以使多个 不能为null
     */
    public void hdel(String key, Object... item){
        redisTemplate.opsForHash().delete(key,item);
    }

    /**
     * 判断hash表中是否有该项的值
     * @param key 键 不能为null
     * @param item 项 不能为null
     * @return true 存在 false不存在
     */
    public boolean hHasKey(String key, String item){
        return redisTemplate.opsForHash().hasKey(key, item);
    }

    /**
     * hash 递增
     * @param key
     * @param item
     * @param by
     * @return
     */
    public double hincr(String key, String item, double by){
        return redisTemplate.opsForHash().increment(key, item, by);
    }

    /**
     * hash 递减
     * @param key
     * @param item
     * @param by
     * @return
     */
    public double hdecr(String key, String item, double by){
        return redisTemplate.opsForHash().increment(key, item, -by);
    }
}
