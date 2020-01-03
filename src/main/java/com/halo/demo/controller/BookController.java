package com.halo.demo.controller;

import com.halo.demo.model.Book;
import com.halo.demo.model.Game;
import com.halo.demo.model.Paper;
import com.halo.demo.service.BookService;
import com.halo.demo.service.PaperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author halo.
 * @email ironerhalo@gmail.com.
 * @data 2019/12/1 19:28.
 */

@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    /**
     * 查询所有的项目信息
     */
    @RequestMapping("/ManageBook")
    public String teacherInfo(HttpServletRequest request, Model model) {
        List<Book> books = bookService.getAllBook();
        request.getSession().setAttribute("allBook", books);
        model.addAttribute("allBook", books);
        return "book_info";
    }

    @RequestMapping("/teacherbook")
    public String teacherbook(HttpServletRequest request, Model model) {
        HttpSession session = request.getSession();
        Integer author = (Integer) session.getAttribute("tno");
        List<Book> books = bookService.getBook(author);
        request.getSession().setAttribute("allBook", books);
        model.addAttribute("allBook", books);
        return "teacher_book";
    }

    @RequestMapping("/BooksAddAction")
    public String PapersAddAction(HttpServletRequest request, Model model) {
        return "teacher_book_add";
    }

    @RequestMapping("/DobooksAdd")
    public String dobooksAdd(@RequestParam("bno") Integer bno,
                             @RequestParam("bname") String bname,
                             @RequestParam("author") Integer author,
                             @RequestParam("type") String type,
                             @RequestParam("pubdate") long pubdate,
                             @RequestParam("rank") String rank,
                             @RequestParam("rankno") Integer rankno, HttpServletRequest request) {

        Book book = new Book();
        book.setBno(bno);
        book.setBname(bname);
        book.setAuthor(author);
        book.setType(type);
        book.setPubdate(pubdate);
        book.setRank(rank);
        book.setRankno(rankno);
        bookService.addbook(book);
        return "teacher_book";
    }
}