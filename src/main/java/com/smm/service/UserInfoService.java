package com.smm.service;

import com.smm.entity.Test;
import org.springframework.stereotype.Component;

import java.util.List;

public interface UserInfoService {

    /**
     * 注册一个新用户
     */
    public void addUser(String sex,String name,int age,String email,String password,String mobile,String address);

}
