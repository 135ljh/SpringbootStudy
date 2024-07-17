package com.ljh.backend.mapper;

import com.ljh.backend.model.Grade;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface GradeMapper {
    @Select("select * from grades where studentid=#{studentid}")
    Grade getGradeById(String studentid);



}
