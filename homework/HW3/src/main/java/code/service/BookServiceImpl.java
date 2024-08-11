package code.service;

import code.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import code.repository.BookRepository;

import java.util.List;

@Component
public class BookServiceImpl implements code.service.BookService {

    private final BookRepository repository;

    @Autowired
    public BookServiceImpl(BookRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Book> getAllBooks() {
        return repository.findAll();
    }

    @Override
    public Book getBookById(String id) {
        return null;
    }

    @Override
    public Book save(Book product) {
        return null;
    }
}