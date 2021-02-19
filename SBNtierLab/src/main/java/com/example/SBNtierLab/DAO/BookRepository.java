package com.example.SBNtierLab.DAO;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.SBNtierLab.Entity.Book;

public interface BookRepository extends MongoRepository <Book, Integer>{
    //will use <Book,
    //Integer> that implements the type of data (Book) and ID (Integer)
    //(inor: an empty Class is just fine for now, but later if you need to add like find by title or
    //other methods, you can define inside the class)
}
