package com.example.graphql.service;

import com.example.graphql.dto.BookRequest;
import com.example.graphql.entity.Book;

import java.util.List;

public interface BookService {

    Book createBook(BookRequest book);

    List<Book> getAllBook();

    Book getBook(long id);
}
