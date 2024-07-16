package com.ljh.test3.mapper;

import com.ljh.test3.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {
    @Select("select * from tb_user")
    public List<User> findAll();
}
