package com.sugar.service.interfaces;

import com.sugar.model.User;

/**
 * @author: chensj
 * @Date: 2018/2/26 下午3:22
 */
public interface UserService {
    int addUser(User user);

    User qryUserByWxChat(String wxchat);

    User qryUserById(Long id);
}
