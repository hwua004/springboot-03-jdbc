package com.hwua.springboot.dao;

import com.hwua.springboot.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;
@Mapper
public interface UserDao {

    public int addUser(User user);

    public int delUser(int userId);

    public int updateUser(User user);

    public User queryUserByName(String name);

    public List<User> queryAll();

    public List<Map<String,Object>> queryAllUserMap();
}
