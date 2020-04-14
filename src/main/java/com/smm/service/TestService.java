package com.smm.service;

import com.smm.entity.Test;

import java.util.List;

public interface TestService {


    /**
     * 插入操作
     */
    public void saveUser(String sex,String name,int age,String email,String password,String mobile,String address);

}
