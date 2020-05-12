package test;

import com.smm.entity.AllInfoOfShares;
import com.smm.service.SharesInfoService;
import com.smm.service.UserInfoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Calendar;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath:spring-dao.xml", "classpath:spring-service.xml" , "classpath:spring-mvc.xml","classpath:mybatis-config.xml"})
public class ServiceTest {

    @Autowired
    private UserInfoService userInfoService;
    @Autowired
    private SharesInfoService sharesInfoService;

    //测试股票信息service
    @Test
    public void testsharesInfoService() throws Exception {
        int i = sharesInfoService.saveSharesInfo(new AllInfoOfShares("测试股票", 000001, 10, 15, 100, 100, 80, "测试类型", 100, Calendar.getInstance().getTime()));
        System.out.println(i);
    }

    @Test
    public void testInsertAppointment() throws Exception {
        userInfoService.addUser("男","name",90,"email","password","mobile","address");
    }

}
