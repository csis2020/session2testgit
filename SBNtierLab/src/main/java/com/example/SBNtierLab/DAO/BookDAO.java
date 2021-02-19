package com.example.SBNtierLab.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.example.SBNtierLab.Entity.Book;

import java.util.Collection;

@Component
public class BookDAO {

    @Autowired
    private BookRepository bookRepository;

    public Collection<Book> getBooks(){
        return bookRepository.findAll();

    }

    public Book createBook(Book book){
        return bookRepository.insert(book);
    }
}
