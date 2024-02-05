package com.example.graphql.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class DataResponse<T> {

    T data;
    Response status;

}
