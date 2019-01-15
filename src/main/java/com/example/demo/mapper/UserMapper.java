package com.example.demo.mapper;

import com.example.demo.entity.User;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @auth jp
 * @Date 2019/1/3
 */
@Component(value = "userMapper")
public interface UserMapper extends Mapper<User>, MySqlMapper<User> {
}
