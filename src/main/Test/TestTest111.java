import org.apache.ibatis.io.Resources;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestTest111 {


    /**
     * 测试框架
     * @throws SQLException
     */
    @Test
    public void Test2() throws SQLException {


    }

    /**
     * spring测试连接
     * @throws SQLException
     */
//    @Test
//    public void Test1() throws SQLException {
//        ClassPathXmlApplicationContext ca = new ClassPathXmlApplicationContext("spring-dao.xml");
//        DataSource dataSource = (DataSource) ca.getBean("dataSource");
//        Connection connection = dataSource.getConnection();
//        System.out.println(connection);
//        String sql = "select * from test";
//        PreparedStatement preparedStatement = connection.prepareStatement(sql);
//        ResultSet resultSet = preparedStatement.executeQuery();
//        while (resultSet.next()){
//            System.out.println(resultSet.getString(1));
//        }
//    }
}
