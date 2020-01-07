package com.halo.demo.controller;

import com.halo.demo.dto.TeacherDTO;
import com.halo.demo.model.Book;
import com.halo.demo.model.Paper;
import com.halo.demo.model.Project;
import com.halo.demo.model.Teacher;
import com.halo.demo.service.PaperService;
import com.halo.demo.service.ProjectService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

/**
 * @author halo.
 * @email ironerhalo@gmail.com.
 * @data 2019/12/1 19:28.
 */

@Controller
public class PaperController {

    @Autowired
    private PaperService paperService;

    /**
     * 查询所有的项目信息
     */
    @RequestMapping("/ManagePaper")
    public String teacherInfo(HttpServletRequest request, Model model) {
        List<Paper> papaers = paperService.getAllPaper();
        request.getSession().setAttribute("allPaper", papaers);
        model.addAttribute("allPaper", papaers);
        return "paper_info";
    }

    @RequestMapping("/DoPapersUpdate")
    public String dopapersUpdate(@RequestParam("ppno") Integer ppno,
                              @RequestParam("ppname") String ppname,
                              @RequestParam("author") Integer author,
                              @RequestParam("journal") String journal,
                              @RequestParam("pubdate") long pubdate,
                              @RequestParam("rank") String rank,
                              @RequestParam("rankno") Integer rankno, HttpServletRequest request) {

        Paper paper = new Paper();
        paper.setPpno(ppno);
        paper.setPpname(ppname);
        paper.setAuthor(author);
        paper.setJournal(journal);
        paper.setPubdate(pubdate);
        paper.setRank(rank);
        paper.setRankno(rankno);
        paperService.updatePaper(paper);
        return "paper_info";
    }

    @RequestMapping("/UpdatePaper")
    public String updatePaper(Map<String, Object> paramMap, HttpServletRequest httpServletRequest) {
        String ppno = httpServletRequest.getParameter("ppno");
        int ppno_int = Integer.parseInt(ppno);
        Paper paper = paperService.getPaperByPpno(ppno_int);
        paramMap.put("updatePaper", paper);
        return "papers_alter";
    }

    @RequestMapping("/DeletePaper")
    public String DeletePaper(HttpServletRequest httpServletRequest) {
        String ppno = httpServletRequest.getParameter("ppno");
        int ppno_int = Integer.parseInt(ppno);
        paperService.delPaperByPpno(ppno_int);
        return "paper_info";
    }

    @RequestMapping("/teacherpaper")
    public String teacherpaper(HttpServletRequest request, Model model) {
        HttpSession session = request.getSession();
        Integer author = (Integer) session.getAttribute("tno");
        List<Paper> papaers = paperService.getPaper(author);

        request.getSession().setAttribute("allPaper", papaers);
        model.addAttribute("allPaper", papaers);
        return "teacher_paper";
    }


    @RequestMapping("/PapersAddAction")
    public String PapersAddAction(HttpServletRequest request, Model model) {
        return "teacher_paper_add";
    }

    @RequestMapping("/DopapersAdd")
    public String dopapersAdd(@RequestParam("ppno") Integer ppno,
                                @RequestParam("ppname") String ppname,
                                @RequestParam("author") Integer author,
                                @RequestParam("journal") String journal,
                                @RequestParam("pubdate") long pubdate,
                                @RequestParam("rank") String rank,
                               @RequestParam("rankno") Integer rankno, HttpServletRequest request) {

        Paper paper = new Paper();
        paper.setPpno(ppno);
        paper.setPpname(ppname);
        paper.setAuthor(author);
        paper.setJournal(journal);
        paper.setPubdate(pubdate);
        paper.setRank(rank);
        paper.setRankno(rankno);
        paperService.addpaper(paper);
        return "teacher_paper";
    }
}