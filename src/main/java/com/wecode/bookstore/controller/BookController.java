package com.wecode.bookstore.controller;

import com.wecode.bookstore.dto.BookDto;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/v1/books")
public class BookController {

    @GetMapping
    public ResponseEntity<List<BookDto>> getBooks() {
        BookDto bookDto = BookDto.builder()
                .title("My  First book title")
                .build();

        List<BookDto> books = new ArrayList<>();
        books.add(bookDto);
        return ResponseEntity.ok(books);
    }
}
