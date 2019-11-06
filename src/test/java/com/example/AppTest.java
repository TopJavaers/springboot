package com.example;

import com.example.demo.DemoApplication;
import com.example.demo.Pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class)
public class AppTest {
    @Autowired
    private RedisTemplate redisTemplate;
    @Test
    public void testRedisTemplate(){
        // 存d到redis数据库
        redisTemplate.opsForValue().set("hello","0708java");
        // 取
        String str =(String) redisTemplate.opsForValue().get("hello");
        System.out.println(str);
        User user = new User();
        user.setId(1L);
        user.setName("admin");
        user.setAge(12);
        redisTemplate.opsForValue().set("user",user);
        User user1 = (User)redisTemplate.opsForValue().get("user");
        System.out.println(user1);
    }
}
