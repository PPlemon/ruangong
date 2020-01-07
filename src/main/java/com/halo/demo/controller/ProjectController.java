package com.halo.demo.controller;


import com.halo.demo.model.Project;
import com.halo.demo.model.Project;
import com.halo.demo.model.Project;
import com.halo.demo.service.ProjectService;
import com.halo.demo.service.ProjectService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.management.modelmbean.RequiredModelMBean;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

/**
 * @author halo.
 * @manager ironerhalo@gmail.com.
 * @data 2019/12/1 19:28.
 */

@Controller
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    /**
     * 查询所有的项目信息
     */
    @RequestMapping("/ManageProject")
    public String projectInfo(HttpServletRequest request, Model model) {
        List<Project> projects = projectService.getAllProject();
        request.getSession().setAttribute("allProject", projects);
        model.addAttribute("allProject", projects);
        return "project_info";
    }

    @RequestMapping("/DoProjectsUpdate")
    public String doProjectsUpdate(@RequestParam("pno") Integer pno,
                                @RequestParam("pname") String pname,
                                @RequestParam("manager") Integer manager,
                                @RequestParam("rank") String rank,
                                @RequestParam("rankno") Integer rankno, HttpServletRequest request) {

        Project project = new Project();
        project.setPno(pno);
        project.setPname(pname);
        project.setManager(manager);
        project.setRank(rank);
        project.setRankno(rankno);
        projectService.updateProject(project);
        return "project_info";
    }

    @RequestMapping("/UpdateProject")
    public String updateProject(Map<String, Object> paramMap, HttpServletRequest httpServletRequest) {
        String pno = httpServletRequest.getParameter("pno");
        int pno_int = Integer.parseInt(pno);
        Project project = projectService.getProjectByPno(pno_int);
        paramMap.put("updateProject", project);
        return "projects_alter";
    }

    @RequestMapping("/DeleteProject")
    public String DeleteProject(HttpServletRequest httpServletRequest) {
        String pno = httpServletRequest.getParameter("pno");
        int pno_int = Integer.parseInt(pno);
        projectService.delProjectByPno(pno_int);
        return "project_info";
    }
    
    @RequestMapping("/teacherproject")
    public String projectproject(HttpServletRequest request, Model model) {

        HttpSession session = request.getSession();
        Integer manager = (Integer) session.getAttribute("tno");

        List<Project> projects = projectService.getProject(manager);

        request.getSession().setAttribute("allProject", projects);
        model.addAttribute("allProject", projects);
        return "teacher_project";
    }

    @RequestMapping("/ProjectsAddAction")
    public String ProjectsAddAction(HttpServletRequest request, Model model) {
        return "teacher_project_add";
    }

    @RequestMapping("/DoprojectsAdd")
    public String doprojectsAdd(@RequestParam("pno") Integer pno,
                              @RequestParam("pname") String pname,
                              @RequestParam("manager") Integer manager,
                              @RequestParam("rank") String rank,
                              @RequestParam("rankno") Integer rankno, HttpServletRequest request) {

        Project project = new Project();
        project.setPno(pno);
        project.setPname(pname);
        project.setManager(manager);
        project.setRank(rank);
        project.setRankno(rankno);
        projectService.addproject(project);
        HttpSession session = request.getSession();
        Integer type1 = (Integer) session.getAttribute("type");
        if(type1 == 2){                                       //2代表教师
            return "redirect:/teacherproject";
        }
        return "redirect:/ManageProject";
    }

    @PostMapping("/SearchProjects")
    public String SearchProjects(HttpServletRequest httpServletRequest) {

        Project project = new Project();
        Integer pno = (httpServletRequest.getParameter("pno").equals("")) ? null : Integer.parseInt(httpServletRequest.getParameter("pno"));
        String pname = (httpServletRequest.getParameter("pname").equals("")) ? null : httpServletRequest.getParameter("pname");
        Integer manager = (httpServletRequest.getParameter("manager").equals("")) ? null : Integer.parseInt(httpServletRequest.getParameter("manager"));
        String rank = (httpServletRequest.getParameter("rank").equals("")) ? null : httpServletRequest.getParameter("rank");
        project.setPno(pno);
        project.setPname(pname);
        project.setManager(manager);
        project.setRank(rank);
        List<Project> projectsByExample = projectService.getProjectByExample(project);
        System.out.println(projectsByExample);
        httpServletRequest.getSession().setAttribute("allProject", projectsByExample);
        return "forward:/ProjectsPage";
    }

    @RequestMapping("/ProjectsPage")
    public String projectsPage(HttpServletRequest httpServletRequest) {
        Object allProject = httpServletRequest.getSession().getAttribute("allProject");
        System.out.println(allProject);
        httpServletRequest.setAttribute("allProject", allProject);
        return "project_info";
    }

}