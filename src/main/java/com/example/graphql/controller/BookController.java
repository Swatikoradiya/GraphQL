package com.example.graphql.controller;

import com.example.graphql.dto.BookRequest;
import com.example.graphql.dto.DataResponse;
import com.example.graphql.dto.Response;
import com.example.graphql.entity.Book;
import com.example.graphql.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    BookService bookService;

    @MutationMapping("createBook")
    DataResponse<Book> addBooks(@Argument BookRequest bookRequest) {
        DataResponse<Book> dataResponse = new DataResponse<>();
        try {
            dataResponse.setData(bookService.createBook(bookRequest));
            dataResponse.setStatus(Response.getSuccessMessage());
        } catch (Exception e) {
            e.printStackTrace();
            dataResponse.setStatus(Response.getErrorMessage(e.getMessage()));
        }

        return dataResponse;
    }

    @QueryMapping("getBook")
    Book getBook(@Argument long id) {
        return bookService.getBook(id);
    }

    @QueryMapping("getAllBook")
    List<Book> getAllBook() {
        return bookService.getAllBook();
    }
}
