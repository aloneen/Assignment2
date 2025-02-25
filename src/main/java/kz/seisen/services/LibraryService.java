package kz.seisen.services;

public interface LibraryService {
    String borrowBook(String bookId);
    String returnBook(String bookId);
}
