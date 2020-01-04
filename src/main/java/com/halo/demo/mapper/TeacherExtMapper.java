package com.halo.demo.mapper;

import com.halo.demo.model.Teacher;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeacherExtMapper {
    List<Teacher> getTeachersByExample(Teacher teacher);
}