package com.librarymanagement.service;

import com.librarymanagement.repository.BookRepository;

public class BookService {
    
    private BookRepository bookRepository;

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
