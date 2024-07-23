package com.example.CrudLibros.Controller;

import com.example.CrudLibros.Entity.Book;
import com.example.CrudLibros.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path= "api/v1/book")
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping
    public List<Book> getAll() {
        return bookService.getBooks();
    }

    @GetMapping("/{bookId}")
    public Optional<Book> getBId(@PathVariable("bookId") Long bookId) {
        return bookService.getBookById(bookId);
    }

    @PostMapping
    public void saveOUpdate(@RequestBody Book book) {
        bookService.saveOUpdate(book);
    }

    @DeleteMapping("/{bookId}")
    public void delate(@PathVariable("bookId") Long bookId) {
        bookService.delete(bookId);
    }


}
