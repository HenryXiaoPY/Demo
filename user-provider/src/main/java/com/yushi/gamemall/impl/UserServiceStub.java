package com.yushi.gamemall.impl;

import com.yushi.bean.UserAddress;
import com.yushi.service.UserService;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * @Author: xiaolong
 * @Date: 2019/7/2 8:19
 */
public class UserServiceStub implements UserService{
    private final UserService userService;

    public UserServiceStub(UserService userService) {
        super();
        this.userService = userService;
    }

    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        // TODO Auto-generated method stub
        System.out.println("UserServiceStub.....");
        if(!StringUtils.isEmpty(userId)) {
            return userService.getUserAddressList(userId);
        }
        return null;
    }
}
