package com.example.SBNtierLab.service;

import com.example.SBNtierLab.DAO.BookDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Collection;
import com.example.SBNtierLab.Entity.Book;

@Service
public class BookService {

    @Autowired
    private BookDAO bookDAO;

    /*
    public BookService(BookDAO bookDAO) {
        this.bookDAO = bookDAO;
    }
    */

    public Collection<Book> getBooks(){
        return bookDAO.getBooks();
    }

    public Book createBook(Book book) {
        return bookDAO.createBook(book);
    }
}
