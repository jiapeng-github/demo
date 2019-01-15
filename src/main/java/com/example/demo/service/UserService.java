package com.example.demo.service;

import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @auth jp
 * @Date 2019/1/3
 */
@Service
public class UserService{

    @Autowired
    private UserMapper userMapper;

    public User get(Integer id){
        return userMapper.selectByPrimaryKey(id);
    }

    public List<User> findAll() {
        List<User> userList = userMapper.selectAll();
        return userList;
    }

    public int insert(User user) {
        return userMapper.insert(user);
    }

    public int insert(List<User> list) {
        return userMapper.insertList(list);
    }
}
