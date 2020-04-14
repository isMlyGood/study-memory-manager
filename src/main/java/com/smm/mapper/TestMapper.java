package com.smm.mapper;

import com.smm.entity.Test;
import com.smm.entity.UserInfo;
import org.springframework.stereotype.Repository;

@Repository("testMapper")
public interface TestMapper {

    public void saveUser(Test test);
}
