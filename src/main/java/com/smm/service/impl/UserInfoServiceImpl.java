package com.smm.service.impl;

import com.smm.entity.UserInfo;
import com.smm.mapper.UserInfoMapper;
import com.smm.service.UserInfoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userInfoService")
public class UserInfoServiceImpl implements UserInfoService {


    private final UserInfoMapper userInfoMapper;

    @Autowired
    public UserInfoServiceImpl(UserInfoMapper userInfoMapper) {
        this.userInfoMapper = userInfoMapper;
    }

    public int loginUser(String username, String password) {

        return 0;
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
    public int addUser(String sex, String name, int age, String email, String password, String mobile, String address) {
        UserInfo userInfo = new UserInfo();
        userInfo.setSex(sex);
        userInfo.setName(name);
        userInfo.setAge(age);
        userInfo.setEmail(email);
        userInfo.setPassword(password);
        userInfo.setPhone(mobile);
        userInfo.setAddress(address);
        int logo = userInfoMapper.saveUser(userInfo);
        return logo;
    }

}
