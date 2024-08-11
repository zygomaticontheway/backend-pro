package code.repository;

import code.entity.Book;

import java.util.List;

public interface BookRepository {

    List<Book> findAll();

    Book save(Book book);

    Book delete(Book book);

    Book getBookById(String id);
}
