package com.ljh.backend.mapper;

import com.ljh.backend.Dto.GradeDto;
import com.ljh.backend.model.Grade;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface GradeMapper {

    // 将Grade转换为GradeDto,映射接口
    GradeDto toDto(Grade grade);
    @Select("select * from grades where studentid=#{studentid}")
    Grade getGradeById(String studentid);

    @Insert("insert into grades (studentid, grade) values (#{studentid}, #{grade})")
    void addGrade(Grade grade);

    @Select("select * from grades")
    List<Grade> getAllGrades();



}
