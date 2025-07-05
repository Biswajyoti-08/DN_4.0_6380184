package com.librarymanagement.library.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.librarymanagement.library.model.Book;
import com.librarymanagement.library.service.BookService;
@RestController
public class BookController {

    @Autowired
    BookService service;
    
    @RequestMapping("/getBooks")
    public List<Book> getProducts(){
        return service.getBooks();
    }
    @RequestMapping("/getBooks/{prodId}")
    public Book getProductbyID(
       @PathVariable("prodId") int bookId){
        
        return service.getBookById(bookId);
    }
 @PostMapping("/addBook")
    public void addBook(@RequestBody Book book) {
        service.addBook(book);
    }
 @DeleteMapping("delete/{bookId}")
    public void deleteProduct(@PathVariable("bookId") int bookId) {
        service.deleteBook(bookId);
    }
@PatchMapping("/update")
public void updateProd(@RequestBody Book book){
    service.updateBook(book);
}
}


