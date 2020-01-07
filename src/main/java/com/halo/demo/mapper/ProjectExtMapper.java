package com.halo.demo.mapper;

import com.halo.demo.model.Project;
import com.halo.demo.model.Teacher;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProjectExtMapper {
    List<Project> getProjectsByExample(Project project);
}