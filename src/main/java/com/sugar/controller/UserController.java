package com.sugar.controller;

import com.sugar.model.User;
import com.sugar.service.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: chensj
 * @Date: 2018/2/26 下午3:33
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping(value = "/add", produces = {"application/json;charset=UTF-8"})
    public int addUser(User user){
       return userService.addUser(user);
    }

    @ResponseBody
    @RequestMapping(value = "/query/{wxchat}/", produces = {"application/json;charset=UTF-8"})
    public User queryUser(@PathVariable("wxchat") String wxchat){
       return userService.qryUserByWxChat(wxchat);
    }

    @ResponseBody
    @RequestMapping(value = "/queryId/{id}/", produces = {"application/json;charset=UTF-8"})
    public User queryUser(@PathVariable("id") long id){
        return userService.qryUserById(id);
    }
}
