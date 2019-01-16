package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @auth jp
 * @Date 2019/1/16
 */

@SpringBootTest
@RunWith(SpringRunner.class)
@Component
public class RedisTest {
    @Autowired
    private StringRedisTemplate redisTemplate;

    @Test
    public void  getRedisValue(){
        String a = redisTemplate.opsForValue().get("foo");
        System.out.println(a);
    }
}


