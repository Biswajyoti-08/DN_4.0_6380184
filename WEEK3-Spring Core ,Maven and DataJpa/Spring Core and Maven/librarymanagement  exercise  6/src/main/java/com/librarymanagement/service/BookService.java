package com.librarymanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.librarymanagement.repository.BookRepository;
@Service
public class BookService {
    private BookRepository bookRepository;
    @Autowired
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void verifyInjection() {
        bookRepository.demoRepo();
    }

    public void demobookservice() {
        System.out.println("running using context");
    }
}
