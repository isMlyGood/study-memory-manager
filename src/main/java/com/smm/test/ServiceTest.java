package com.smm.test;

import com.smm.entity.UserInfo;
import com.smm.mapper.TestMapper;
import com.smm.mapper.UserInfoMapper;
import com.smm.service.UserInfoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath:spring-dao.xml", "classpath:spring-service.xml" , "classpath:spring-mvc.xml","classpath:mybatis-config.xml"})
public class ServiceTest {

    @Autowired
    private UserInfoService userInfoService;

    @Test
    public void testInsertAppointment() throws Exception {
        userInfoService.addUser("男","name",90,"email","password","mobile","address");
    }

}
