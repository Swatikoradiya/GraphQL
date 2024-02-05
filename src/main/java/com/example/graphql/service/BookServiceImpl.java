package com.example.graphql.service;

import com.example.graphql.dto.BookRequest;
import com.example.graphql.entity.Book;
import com.example.graphql.repository.BooksRepository;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class BookServiceImpl implements BookService{

    @Autowired
    BooksRepository booksRepository;

    @Autowired
    ModelMapper modelMapper;

    @Override
    public Book createBook(BookRequest bookRequest) {
        log.info("Book Request : {}", bookRequest);
        Book book = modelMapper.map(bookRequest, Book.class);
        log.info("Book : {}", book);
        return booksRepository.save(book);
    }

    @Override
    public List<Book> getAllBook() {
        return booksRepository.findAll();
    }

    @Override
    public Book getBook(long id) {
        return booksRepository.findById(id).orElseThrow(() -> new RuntimeException("Book not found"));
    }
}
