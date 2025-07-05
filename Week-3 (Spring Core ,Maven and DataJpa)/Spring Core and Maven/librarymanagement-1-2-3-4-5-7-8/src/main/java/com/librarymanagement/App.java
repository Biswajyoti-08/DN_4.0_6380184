package com.librarymanagement;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.librarymanagement.repository.BookRepository;
import com.librarymanagement.service.BookService;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = 
            new ClassPathXmlApplicationContext("applicationContext.xml");

        BookService bookService = context.getBean("bookService", BookService.class);
        bookService.demobookservice();

      
        BookRepository bookRepository = 
            context.getBean("bookRepository", BookRepository.class);
        bookRepository.demoRepo();

      
        bookService.verifyInjection();
    }
}
