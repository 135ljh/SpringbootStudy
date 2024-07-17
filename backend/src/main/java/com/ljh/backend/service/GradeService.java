package com.ljh.backend.service;

import com.ljh.backend.Dto.GradeDto;
import com.ljh.backend.mapper.GradeMapper;
import com.ljh.backend.model.Grade;
import org.springframework.stereotype.Service;

@Service
public class GradeService {
    private final GradeMapper gradeMapper;

    public GradeService(GradeMapper gradeMapper) {
        this.gradeMapper = gradeMapper;
    }


    public GradeDto getGrade(String studentid) {
        Grade grade = gradeMapper.getGradeById(studentid);
        return grade != null ? gradeMapper.toDto(grade) : null;
    }






}
