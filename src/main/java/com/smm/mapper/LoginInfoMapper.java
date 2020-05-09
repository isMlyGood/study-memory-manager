package com.smm.mapper;

import com.smm.entity.LoginInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("loginInfoMapper")
public interface LoginInfoMapper {
    /**
     * 根据账号查询用户
     * @get 账号密码
     */
    public List<LoginInfo> queryUserByUsername(LoginInfo loginInfo);
}
