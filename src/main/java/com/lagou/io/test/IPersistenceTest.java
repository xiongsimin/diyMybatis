package com.lagou.io.test;

import com.lagou.dao.IUserDao;
import com.lagou.io.Resources;
import com.lagou.pojo.User;
import com.lagou.sqlSession.SqlSession;
import com.lagou.sqlSession.SqlSessionFactory;
import com.lagou.sqlSession.SqlSessionFactoryBuilder;
import org.dom4j.DocumentException;
import org.junit.Test;

import java.beans.IntrospectionException;
import java.beans.PropertyVetoException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;

/**
 * @author xiongsm
 */
public class IPersistenceTest {
    @Test
    public void test() throws PropertyVetoException, DocumentException, SQLException, IllegalAccessException, IntrospectionException, InstantiationException, NoSuchFieldException, InvocationTargetException, ClassNotFoundException, UnsupportedEncodingException {
        InputStream resourceAsSteam = Resources.getResourceAsSteam("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().builder(resourceAsSteam);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //调用
        User user = new User();
        user.setId(1);
        user.setName("张三");
        /*User user1 = sqlSession.selectOne("user.selectOne", user);
        System.out.println(user1);
        List<User> users = sqlSession.selectList("user.selectList");
        for (User user2 : users) {
            System.out.println(user2);
        }*/
        IUserDao userDao = sqlSession.getMapper(IUserDao.class);
        //代理对象调用接口中任意方法，都会执行invoke方法
        List<User> all = userDao.findAll();
        /*User user1 = userDao.findByCondition(user);
        System.out.println(user1);*/
        for (User u : all) {
            System.out.println(u);
        }

    }
}
