package com.ljh.backend.service;

import com.ljh.backend.Dto.GradeDto;
import com.ljh.backend.mapper.GradeMapper;
import com.ljh.backend.model.Grade;
import org.apache.ibatis.javassist.NotFoundException;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;


@Service
public class GradeService {
    private final GradeMapper gradeMapper;
    private final ModelMapper modelMapper = new ModelMapper();

    public GradeService(GradeMapper gradeMapper) {
        this.gradeMapper = gradeMapper;
    }



    public GradeDto getGrade(String studentid) throws NotFoundException {
        if (studentid == null || studentid.isEmpty()) {
            throw new IllegalArgumentException("Student ID must not be null or empty");
        }

        Grade grade = gradeMapper.getGradeById(studentid);

        if (grade == null) {
            throw new NotFoundException("Grade for student with ID " + studentid + " not found");
        }

        return gradeMapper.toDto(grade);
    }

    public GradeDto addGrade(GradeDto grade) {
        gradeMapper.addGrade(modelMapper.map(grade, Grade.class));
        return grade;
    }






}
