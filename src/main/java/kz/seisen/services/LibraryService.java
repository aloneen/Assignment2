package kz.seisen.services;

import kz.seisen.model.Book;

public interface LibraryService {
    Book borrowBook(Long bookId);
    void returnBook(Book book);
    void saveBook(Book book);
}
