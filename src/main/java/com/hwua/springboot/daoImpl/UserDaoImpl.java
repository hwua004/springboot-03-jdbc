package com.hwua.springboot.daoImpl;

import com.hwua.springboot.dao.UserDao;
import com.hwua.springboot.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
@Repository
public class UserDaoImpl implements UserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int addUser(User user) {
        String sql="insert into user values(null,?,?,?,?,?,?)";
        return jdbcTemplate.update(sql,user.getUsername(),user.getPassword(),user.getRealname()
                ,user.getPassword(),user.getEmial(),user.getStatus());
    }

    @Override
    public int delUser(int userId) {
        String sql="delete from user where id = ?";
        return jdbcTemplate.update(sql,userId);
    }

    @Override
    public int updateUser(User user) {
        String sql="update user set password = ?  where id = ? ";
        return jdbcTemplate.update(sql,user.getPassword(),user.getId());
    }

    @Override
    public User queryUserByName(String name) {
        String sql="select * from user where username = ?";
        return jdbcTemplate.queryForObject(sql,new BeanPropertyRowMapper<User>(User.class),name);
    }

    @Override
    public List<User> queryAll() {
        String sql="select * from user ";
        return jdbcTemplate.query(sql,new BeanPropertyRowMapper<User>(User.class));

    }

    @Override
    public List<Map<String, Object>> queryAllUserMap() {
        String sql="select * from user ";
        return jdbcTemplate.queryForList(sql);
    }
}
