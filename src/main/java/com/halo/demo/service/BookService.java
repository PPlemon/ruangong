package com.halo.demo.service;

import com.halo.demo.mapper.BookMapper;
import com.halo.demo.mapper.PaperMapper;
import com.halo.demo.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author halo.
 * @email ironerhalo@gmail.com.
 * @data 2019/12/1 19:30.
 */

@Service
public class BookService {

    @Autowired
    private BookMapper bookMapper;

    public List<Book> getAllBook() {
        BookExample bookExample = new BookExample();
        List<Book> books = bookMapper.selectByExample(bookExample);
        return books;
    }
    public List<Book> getBook(Integer author) {
        BookExample bookExample = new BookExample();
        BookExample.Criteria criteria2 = bookExample.createCriteria();
        criteria2.andAuthorEqualTo(author);
        List<Book> books = bookMapper.selectByExample(bookExample);
        return books;
    }

    public Book addbook(Book book){
        bookMapper.insert(book);
        return null;
    }
}
