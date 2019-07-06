package com.yushi.service;

import com.yushi.bean.UserAddress;

import java.util.List;

/**
 * @Author: xiaolong
 * @Date: 2019/7/2 7:45
 * 初始化订单
 */
public interface OrderService {
    public List<UserAddress> initOrder(String userId);
}
