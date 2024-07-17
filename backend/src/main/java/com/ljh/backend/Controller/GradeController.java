package com.ljh.backend.Controller;



import com.ljh.backend.Dto.GradeDto;
import com.ljh.backend.service.GradeService;
import org.apache.ibatis.javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class GradeController {
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

    @GetMapping("/grade")
    public GradeDto getGrade(@RequestParam String studentid) throws NotFoundException {
        return gradeService.getGrade(studentid);
    }

    @PostMapping("/add_grade")
    public GradeDto addGrade(@RequestBody GradeDto grade) {
        return gradeService.addGrade(grade);
    }



}
