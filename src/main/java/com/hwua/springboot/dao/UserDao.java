package com.hwua.springboot.dao;

import com.hwua.springboot.entity.User;

import java.util.List;
import java.util.Map;

public interface UserDao {

    public int addUser(User user);

    public int delUser(int userId);

    public int updateUser(User user);

    public User queryUserByName(String name);

    public List<User> queryAll();

    public List<Map<String,Object>> queryAllUserMap();
}
