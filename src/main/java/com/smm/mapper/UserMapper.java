package com.smm.mapper;

import com.smm.entity.UserInfo;

import java.util.List;

public interface UserMapper {
    /**
     * 查询所有
     */
    public List<UserInfo> findAll();
}
