package com.yushi.gamemall.impl;

import com.yushi.bean.UserAddress;
import com.yushi.service.UserService;

import java.util.Arrays;
import java.util.List;

/**
 * @Author: xiaolong
 * @Date: 2019/7/2 8:04
 */

public class UserServiceImpl implements UserService {
    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        // TODO Auto-generated method stub
        UserAddress address1 = new UserAddress(1, "北京市昌平区宏福科技园综合楼3层", "1", "小李", "010-56253825", "Y");
        UserAddress address2 = new UserAddress(2, "深圳市宝安区西部硅谷大厦B座3层（深圳分校）", "1", "小王", "010-56253825", "N");

        return Arrays.asList(address1,address2);
    }
}
