package com.sugar.mapper.extend;

import com.sugar.model.User;

/**
 * @Author: chensj
 * @Date: 2018/3/2 下午3:49
 */
public interface UserExtendMapper {

    User selectByWeChat(String weChat);
}
