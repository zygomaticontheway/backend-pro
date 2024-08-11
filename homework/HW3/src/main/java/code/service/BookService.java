package code.service;


import code.entity.Book;

import java.util.List;

public interface BookService {

    List<Book> getAllBooks();
    Book getBookById(String id);
    Book save (Book product);
}
