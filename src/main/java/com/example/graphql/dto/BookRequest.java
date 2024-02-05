package com.example.graphql.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class BookRequest {

    String title;
    String description;
    String author;
    double price;
    int pages;
}
