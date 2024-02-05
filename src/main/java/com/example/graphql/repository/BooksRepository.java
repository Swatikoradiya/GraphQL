package com.example.graphql.repository;

import com.example.graphql.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BooksRepository extends JpaRepository<Book, Long> {
}
