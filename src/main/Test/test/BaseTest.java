package test;

import com.smm.entity.LoginInfo;
import com.smm.entity.UserInfo;
import com.smm.mapper.AllInfoOfSharesMapper;
import com.smm.mapper.LoginInfoMapper;
import com.smm.mapper.TestMapper;
import com.smm.mapper.UserInfoMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath:spring-dao.xml", "classpath:spring-service.xml" })
public class BaseTest {

    @Autowired
    private UserInfoMapper userInfoMapper;
    @Autowired
    private TestMapper testMapper;
    @Autowired
    private LoginInfoMapper loginInfoMapper;
    @Autowired
    private AllInfoOfSharesMapper allInfoOfSharesMapper;

    //测试allInfoOfShares
    @Test
    public void allInfoOfSharesTest() throws Exception {
//        Calendar ca = Calendar.getInstance();
//        Date time = ca.getTime();
//        AllInfoOfShares allInfoOfShares = new AllInfoOfShares(10,15,100,100,80,"测试类型",100,time);
//        //插入所有
//        int all = allInfoOfSharesMapper.addAll(allInfoOfShares);
//        System.out.println(all);
//        //查询所有
//        List<AllInfoOfShares> all = allInfoOfSharesMapper.findAll();
//        for (AllInfoOfShares data:all) {
//            System.out.println(data);
//        }
    }

    @Test
    public void testSelectByUserNameLoginInfo() throws Exception {
        LoginInfo loginInfo = new LoginInfo();
        loginInfo.setName("mly@zdady.com");
        List<LoginInfo> loginInfos = loginInfoMapper.queryUserByUsername(loginInfo);
        System.out.println(loginInfos.toString());
    }

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
//        userInfoMapper.saveUser(userInfo);
    }

    @Test
    public void test1() throws Exception {
        com.smm.entity.Test test = new com.smm.entity.Test();
        test.setId(10);
        test.setTest("10+test");
        testMapper.saveUser(test);
    }

}
