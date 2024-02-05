package com.example.graphql.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Response {

    HttpStatus code;
    String description;
    String message;

    public static Response getSuccessMessage(String message) {
        return new Response(HttpStatus.OK, "SUCCESS", message);
    }

    public static Response getSuccessMessage() {
        return new Response(HttpStatus.OK, "SUCCESS", "SUCCESS");
    }

    public static Response getErrorMessage(String message) {
        return new Response(HttpStatus.INTERNAL_SERVER_ERROR, "ERROR", message);
    }
}
