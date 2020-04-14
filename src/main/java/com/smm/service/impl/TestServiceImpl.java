package com.smm.service.impl;

import com.smm.entity.UserInfo;
import com.smm.mapper.UserInfoMapper;
import com.smm.service.TestService;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("testService")
public class TestServiceImpl implements TestService{

    private final UserInfoMapper userInfoMapper;

    public TestServiceImpl(@Qualifier("userInfoMapper") UserInfoMapper userInfoMapper) {
        this.userInfoMapper = userInfoMapper;
    }

    /**
     * 测试保存用户
     * @param sex
     * @param name
     * @param age
     * @param email
     * @param password
     * @param mobile
     * @param address
     */
    public void saveUser(String sex,String name,int age,String email,String password,String mobile,String address) {
        UserInfo userInfo = new UserInfo();
        userInfo.setSex(sex);
        userInfo.setName(name);
        userInfo.setAge(age);
        userInfo.setEmail(email);
        userInfo.setPassword(password);
        userInfo.setPhone(mobile);
        userInfo.setAddress(address);
        userInfoMapper.saveUser(userInfo);
    }

}
