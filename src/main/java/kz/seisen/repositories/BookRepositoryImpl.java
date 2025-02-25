package kz.seisen.repositories;

import kz.seisen.model.Book;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class BookRepositoryImpl implements BookRepository {
    private final List<Book> books;

    public BookRepositoryImpl() {
       books = new ArrayList<>();
       books.add(new Book(1L, "Harry Ptoher", "dias"));
       books.add(new Book(2L, "Mainkraft", "dias"));
       books.add(new Book(3L, "Red book", "dias"));
    }





    @Override
    public Book findBookById(Long id) {
        for (Book book : books) {
            if (book.getId().equals(id)) {
                return book;
            }
        }
        return null;
    }
    @Override
    public void addBook(Book book) {
        books.add(book);
    }

    @Override
    public void removeBook(Book book) {
        books.remove(book);
    }
}