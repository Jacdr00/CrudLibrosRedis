package com.example.CrudLibros.Service;

import com.example.CrudLibros.Entity.Book;
import com.example.CrudLibros.Respository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class BookService {
    @Autowired
    BookRepository bookRepository;

    @Cacheable("getBooks")
    public List<Book> getBooks() {
        return bookRepository.findAll();
    }

    public Optional<Book> getBookById(Long id) {
        return bookRepository.findById(id);
    }

    public void saveOUpdate (Book book) {
        bookRepository.save(book);
    }

    public void delete (Long id) {
        bookRepository.deleteById(id);
    }
}
