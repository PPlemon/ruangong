package com.halo.demo.service;

import com.halo.demo.mapper.ProjectMapper;
import com.halo.demo.mapper.TeacherMapper;
import com.halo.demo.model.Project;
import com.halo.demo.model.ProjectExample;
import com.halo.demo.model.Teacher;
import com.halo.demo.model.TeacherExample;
import org.apache.catalina.Manager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author halo.
 * @email ironerhalo@gmail.com.
 * @data 2019/12/1 19:30.
 */

@Service
public class ProjectService {

    @Autowired
    private ProjectMapper projectMapper;

    public List<Project> getAllProject() {
        ProjectExample projectExample = new ProjectExample();
        List<Project> projects = projectMapper.selectByExample(projectExample);
        return projects;
    }
    public List<Project> getProject(Integer Manager) {
        ProjectExample projectExample = new ProjectExample();
        ProjectExample.Criteria criteria2 = projectExample.createCriteria();
        criteria2.andManagerEqualTo(Manager);
        List<Project> projects = projectMapper.selectByExample(projectExample);

        return projects;
    }
    public Project addproject(Project project){
        projectMapper.insert(project);
        return null;
    }
}
