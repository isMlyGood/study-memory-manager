package com.smm.mapper;

import com.smm.entity.UserInfo;
import org.springframework.stereotype.Repository;

@Repository("userInfoMapper")
public interface UserInfoMapper {
    public void saveUser(UserInfo userInfo);
}
