package com.yushi.bean;

import java.io.Serializable;

/**
 * @Author: xiaolong
 * @Date: 2019/7/2 7:32
 */
public class UserAddress implements Serializable {
    //定义用户地址所具有的的属性变量
    private Integer id;
    private String userAddress;
    private String userId;
    private String consignee;
    private String phone;
    private String isDefault;

    //无参构造
    UserAddress(){
        super();
    }
    //有参构造
    public UserAddress(Integer id, String userAddress, String userId, String consignee, String phone, String isDefault){
        super();
        this.id=id;
        this.userAddress=userAddress;
        this.userId=userId;
        this.consignee=consignee;
        this.phone=phone;
        this.isDefault=isDefault;
    }
    //getter、setter方法
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setIsDefault(String isDefault) {
        this.isDefault = isDefault;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public String getUserId() {
        return userId;
    }

    public String getConsignee() {
        return consignee;
    }

    public String getPhone() {
        return phone;
    }

    public String getIsDefault() {
        return isDefault;
    }

}
