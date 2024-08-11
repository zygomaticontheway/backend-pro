package code.controller;

import code.entity.Book;
import code.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
//https://mvnrepository.com/repos/central - склад приложений

@Component
public class BookController {

    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    public List<Book>getAllBooks(){
        return bookService.getAllBooks();
    }
    public Book getBookById(String id){
        return bookService.getBookById(id);
    }

}
