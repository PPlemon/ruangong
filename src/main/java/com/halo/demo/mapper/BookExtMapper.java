package com.halo.demo.mapper;

import com.halo.demo.model.Book;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookExtMapper {
    List<Book> getBooksByExample(Book book);
}