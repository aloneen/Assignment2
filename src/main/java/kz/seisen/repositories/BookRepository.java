package kz.seisen.repositories;

import kz.seisen.model.Book;

public interface BookRepository {
    Book findBookById(Long id);
    void addBook(Book book);
    void removeBook(Book book);
}
