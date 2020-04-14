package com.smm.test;

import com.smm.entity.UserInfo;
import com.smm.mapper.TestMapper;
import com.smm.mapper.UserInfoMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath:spring-dao.xml", "classpath:spring-service.xml" , "classpath:spring-mvc.xml","classpath:mybatis-config.xml"})
public class BaseTest {

    @Autowired
    private UserInfoMapper userInfoMapper;
    @Autowired
    private TestMapper testMapper;

    @Test
    public void testInsertAppointment() throws Exception {
        UserInfo userInfo = new UserInfo();
        userInfo.setSex("男");
        userInfo.setName("name");
        userInfo.setAge(90);
        userInfo.setEmail("email");
        userInfo.setPassword("password");
        userInfo.setPhone("mobile");
        userInfo.setAddress("address");
        userInfoMapper.saveUser(userInfo);
    }

    @Test
    public void test1() throws Exception {
        com.smm.entity.Test test = new com.smm.entity.Test();
        test.setId(10);
        test.setTest("10+test");
        testMapper.saveUser(test);
    }

}
