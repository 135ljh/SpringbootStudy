package com.ljh.test3;

import com.ljh.test3.domain.User;
import com.ljh.test3.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Test3ApplicationTests {
    @Autowired
    private UserMapper userMapper;
    @Test
    public void testFindAll() {
        List<User> users = userMapper.findAll();
        for (User user : users) {
            System.out.println(user);
        }
    }

}
