package com.yushi.service;

import com.yushi.bean.UserAddress;

import java.util.List;

/**
 * @Author: xiaolong
 * @Date: 2019/7/2 7:46
 * 用户服务
 */
public interface UserService {
    //根据用户id返回所有收货地址信息
    public List<UserAddress> getUserAddressList(String userId);
}
