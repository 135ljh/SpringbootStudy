package com.ljh.springbootmybatis;

import com.ljh.springbootmybatis.domain.User;
import com.ljh.springbootmybatis.mapper.UserMapper;
import com.ljh.springbootmybatis.mapper.UserXmlMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringbootMybatisApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserXmlMapper userXmlMapper;
    @Test
    public void testFindAll(){
        List<User> users = userMapper.findAll();
        for (User user : users) {
            System.out.println(user);
        }
    }

    @Test
    public void testFindAll2(){
        List<User> list = userXmlMapper.findAll();
        System.out.println(list);
    }

}
