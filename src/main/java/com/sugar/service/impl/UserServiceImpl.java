package com.sugar.service.impl;

import com.sugar.mapper.UserMapper;
import com.sugar.mapper.extend.UserExtendMapper;
import com.sugar.model.User;
import com.sugar.service.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: chensj
 * @Date: 2018/2/26 下午3:24
 */
@Service(value = "userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserExtendMapper userExtendMapper;
    @Override
    public int addUser(User user) {
        return userMapper.insert(user);
    }

    @Override
    public User qryUserByWxChat(String wxchat) {
        return userExtendMapper.selectByWeChat(wxchat);
    }

    @Override
    public User qryUserById(Long id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
