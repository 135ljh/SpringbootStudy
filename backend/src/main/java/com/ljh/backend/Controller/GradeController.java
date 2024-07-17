package com.ljh.backend.Controller;



import com.ljh.backend.Dto.GradeDto;
import com.ljh.backend.domain.User;
import com.ljh.backend.mapper.GradeMapper;
import com.ljh.backend.mapper.UserMapper;
import com.ljh.backend.model.Grade;
import com.ljh.backend.service.GradeService;
import org.apache.ibatis.javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GradeController {
    @Autowired
    private GradeMapper gradeMapper;

    private final GradeService gradeService;


    /*这个函数是一个构造函数，
    用于在Spring框架中自动装配GradeService实例。
    通过@Autowired注解，
    Spring容器会自动将GradeService的实例注入到GradeController的gradeService成员变量中，
    以便GradeController可以调用GradeService中的方法来处理请求。*/
    @Autowired
    public GradeController(GradeService gradeService) {
        this.gradeService = gradeService;
    }

    /*@RequestParam注解说明该方法通过请求参数的方式获取输入的studentid，用于指定要查询成绩的学生的ID。*/
    @GetMapping("/grade")
    public GradeDto getGrade(@RequestParam String studentid) throws NotFoundException {
        return gradeService.getGrade(studentid);
    }

    /*@RequestBody注解表示该参数是从请求体中获取的*/
    @PostMapping("/add_grade")
    public GradeDto addGrade(@RequestBody GradeDto grade) {
        return gradeService.addGrade(grade);
    }


    @GetMapping("/all_grades")
    public List<Grade> FindAll() {
        List<Grade> grades = gradeMapper.getAllGrades();
        System.out.println(grades);
        return grades;

    }


}
