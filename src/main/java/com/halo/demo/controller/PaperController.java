package com.halo.demo.controller;

import com.halo.demo.dto.TeacherDTO;
import com.halo.demo.model.Book;
import com.halo.demo.model.Paper;
import com.halo.demo.model.Paper;
import com.halo.demo.model.Teacher;
import com.halo.demo.service.PaperService;
import com.halo.demo.service.PaperService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
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
    public String dopapersUpdate(@RequestParam("pppno") Integer pppno,
                              @RequestParam("ppname") String ppname,
                              @RequestParam("author") Integer author,
                              @RequestParam("journal") String journal,
                              @RequestParam("pubdate") long pubdate,
                              @RequestParam("rank") String rank,
                              @RequestParam("rankno") Integer rankno, HttpServletRequest request) {

        Paper paper = new Paper();
        paper.setPpno(pppno);
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
        String pppno = httpServletRequest.getParameter("pppno");
        int pppno_int = Integer.parseInt(pppno);
        Paper paper = paperService.getPaperByPpno(pppno_int);
        paramMap.put("updatePaper", paper);
        return "papers_alter";
    }

    @RequestMapping("/DeletePaper")
    public String DeletePaper(HttpServletRequest httpServletRequest) {
        String pppno = httpServletRequest.getParameter("pppno");
        int pppno_int = Integer.parseInt(pppno);
        paperService.delPaperByPpno(pppno_int);
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
    public String dopapersAdd(@RequestParam("pppno") Integer pppno,
                                @RequestParam("ppname") String ppname,
                                @RequestParam("author") Integer author,
                                @RequestParam("journal") String journal,
                                @RequestParam("pubdate") long pubdate,
                                @RequestParam("rank") String rank,
                               @RequestParam("rankno") Integer rankno, HttpServletRequest request) {

        Paper paper = new Paper();
        paper.setPpno(pppno);
        paper.setPpname(ppname);
        paper.setAuthor(author);
        paper.setJournal(journal);
        paper.setPubdate(pubdate);
        paper.setRank(rank);
        paper.setRankno(rankno);
        paperService.addpaper(paper);
        return "teacher_paper";
    }

    @PostMapping("/SearchPapers")
    public String SearchPapers(HttpServletRequest httpServletRequest) {

        Paper paper = new Paper();
        Integer ppno = (httpServletRequest.getParameter("ppno").equals("")) ? null : Integer.parseInt(httpServletRequest.getParameter("ppno"));
        String ppname = (httpServletRequest.getParameter("ppname").equals("")) ? null : httpServletRequest.getParameter("ppname");
        Integer author = (httpServletRequest.getParameter("author").equals("")) ? null : Integer.parseInt(httpServletRequest.getParameter("author"));
        String rank = (httpServletRequest.getParameter("rank").equals("")) ? null : httpServletRequest.getParameter("rank");
        paper.setPpno(ppno);
        paper.setPpname(ppname);
        paper.setAuthor(author);
        paper.setRank(rank);
        List<Paper> papersByExample = paperService.getPaperByExample(paper);
        System.out.println(papersByExample);
        httpServletRequest.getSession().setAttribute("allPaper", papersByExample);
        return "forward:/PapersPage";
    }

    @RequestMapping("/PapersPage")
    public String papersPage(HttpServletRequest httpServletRequest) {
        Object allPaper = httpServletRequest.getSession().getAttribute("allPaper");
        System.out.println(allPaper);
        httpServletRequest.setAttribute("allPaper", allPaper);
        return "paper_info";
    }
}