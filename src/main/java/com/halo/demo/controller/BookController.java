package com.halo.demo.controller;

import com.halo.demo.model.Book;
import com.halo.demo.model.Game;
import com.halo.demo.model.Book;
import com.halo.demo.service.BookService;
import com.halo.demo.service.BookService;
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

    @RequestMapping("/DoBooksUpdate")
    public String doBookUpdate(@RequestParam("bno") Integer bno,
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
        bookService.updateBook(book);
        return "book_info";
    }

    @RequestMapping("/UpdateBook")
    public String updateBook(Map<String, Object> paramMap, HttpServletRequest httpServletRequest) {
        String bno = httpServletRequest.getParameter("bno");
        int bno_int = Integer.parseInt(bno);
        Book book = bookService.getBookByBno(bno_int);
        paramMap.put("updateBook", book);
        return "books_alter";
    }

    @RequestMapping("/DeleteBook")
    public String DeleteBook(HttpServletRequest httpServletRequest) {
        String bno = httpServletRequest.getParameter("bno");
        int bno_int = Integer.parseInt(bno);
        bookService.delBookByBno(bno_int);
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
    public String BooksAddAction(HttpServletRequest request, Model model) {
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
        HttpSession session = request.getSession();
        Integer type1 = (Integer) session.getAttribute("type");
        if(type1 == 2){                                       //2代表教师
            return "redirect:/teacherbook";
        }
        return "redirect:/ManageBook";
    }
    @PostMapping("/SearchBooks")
    public String SearchBooks(HttpServletRequest httpServletRequest) {

        Book book = new Book();
        Integer bno = (httpServletRequest.getParameter("bno").equals("")) ? null : Integer.parseInt(httpServletRequest.getParameter("bno"));
        String bname = (httpServletRequest.getParameter("bname").equals("")) ? null : httpServletRequest.getParameter("bname");
        Integer author = (httpServletRequest.getParameter("author").equals("")) ? null : Integer.parseInt(httpServletRequest.getParameter("author"));
        String type = (httpServletRequest.getParameter("type").equals("")) ? null : httpServletRequest.getParameter("type");
        String rank = (httpServletRequest.getParameter("rank").equals("")) ? null : httpServletRequest.getParameter("rank");
        book.setBno(bno);
        book.setBname(bname);
        book.setAuthor(author);
        book.setType(type);
        book.setRank(rank);
        List<Book> booksByExample = bookService.getBookByExample(book);
        System.out.println(booksByExample);
        httpServletRequest.getSession().setAttribute("allBook", booksByExample);
        return "forward:/BooksPage";
    }

    @RequestMapping("/BooksPage")
    public String booksPage(HttpServletRequest httpServletRequest) {
        Object allBook = httpServletRequest.getSession().getAttribute("allBook");
        httpServletRequest.setAttribute("allBook", allBook);
        return "book_info";
    }
}