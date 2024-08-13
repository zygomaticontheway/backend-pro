package code.repository;

import code.entity.Book;
import org.springframework.stereotype.Component;

import java.util.List;

import static java.util.Arrays.stream;

@Component
public class BookRepositoryImp implements code.repository.BookRepository {

    List<Book> db = List.of(
            new Book("978-0061120084", "To Kill a Mockingbird", "Harper Lee"),
            new Book("978-0451524935", "1984",  "George Orwell"),
            new Book("978-1503290563", "Pride and Prejudice", "Jane Austen"),
            new Book("978-0743273565", "The Great Gatsby", "F. Scott Fitzgerald")
            );

    @Override
    public List<Book> findAll() {
        return db;
    }

    @Override
    public Book save(Book book) {
        return null;
    }

    @Override
    public Book delete(Book book) {
        return null;
    }

    public Book getBookById(String id) {
        return findAll()
                .stream()
                .filter(book -> book.getId().contains(id))
                .findAny()
                .get();
         }
    };