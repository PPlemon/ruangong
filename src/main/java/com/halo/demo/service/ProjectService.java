package com.halo.demo.service;

import com.halo.demo.mapper.ProjectExtMapper;
import com.halo.demo.mapper.ProjectMapper;
import com.halo.demo.mapper.TeacherMapper;
import com.halo.demo.model.*;
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

    @Autowired
    private ProjectExtMapper projectExtMapper;

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
    public Project getProjectByPno(int pno_int) {
        Project project = projectMapper.selectByPrimaryKey(pno_int);
        return project;
    }

    public void updateProject(Project project) {
        if (project.getPno() != null) {
            ProjectExample projectExample = new ProjectExample();
            projectExample.createCriteria().andPnoEqualTo(project.getPno());
            List<Project> projects = projectMapper.selectByExample(projectExample);
            // 插入用户信息
            if (projects.size() != 0) {
                projectMapper.updateByExampleSelective(project, projectExample);
            }
        }
    }
    public List<Project> getProjectByExample(Project project) {

        return projectExtMapper.getProjectsByExample(project);
    }

    public void delProjectByPno ( int pno){
        {
            projectMapper.deleteByPrimaryKey(pno);
        }
    }
    
}
