package com.hwua.springboot;

import com.hwua.springboot.dao.UserDao;
import com.hwua.springboot.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Springboot03JdbcApplicationTests {
    @Autowired
    private DataSource dataSource;
    @Autowired
    private UserDao userDao;

    @Test
    public void contextLoads() {
        System.out.println(dataSource.getClass().getName());
    }

    @Test
    public void test1() {
        User user= new User(null,"wangwu","123","王五","133","123@321.com","1");
        int a=userDao.addUser(user);
        System.out.println(a);
    }


    @Test
    public void test2() {
        User user= new User();
        user.setId(4);
        user.setPassword("qwerty");
        int a=userDao.updateUser(user);
        System.out.println(a);
    }

    @Test
    public void test3() {
        User user=userDao.queryUserByName("wangwu");
        System.out.println(user);
    }

    @Test
    public void test4() {
        List<User> users=userDao.queryAll();
        for(User user:users){
            System.out.println(user);
        }
    }

    @Test
    public void test5() {
        List<Map<String,Object>> users=userDao.queryAllUserMap();
        for(Map<String,Object> user:users){
            System.out.println(user);
        }
    }

}
