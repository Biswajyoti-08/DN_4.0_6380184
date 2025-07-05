package com.librarymanagement.library.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.librarymanagement.library.model.Book;
import com.librarymanagement.library.repositiory.BookRepo;

@Service
public class BookService {
    @Autowired
    BookRepo repo;
    // private final List<Product> products =new ArrayList<>( Arrays.asList(
    //     new Product(101, "iPhone", 50000),
    //     new Product(102, "Samsung Galaxy", 45000),
    //     new Product(103, "Google Pixel", 47000),
    //     new Product(104, "OnePlus", 42000),
    //     new Product(105, "Xiaomi", 30000)
    // ));

    public List<Book> getBooks() {
        return repo.findAll();
    }
    public Book getBookById(int bookId){
        
        return repo.findById(null).orElse(null);
    }
    public void addBook(Book prod){
        repo.save(prod);
    }
    public void deleteBook(int bookId){
       repo.deleteById(bookId);
    }
   
    public void updateBook(Book prod){
        repo.saveAndFlush(prod);
    }
}
