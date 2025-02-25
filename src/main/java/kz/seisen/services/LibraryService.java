package kz.seisen.services;

public interface LibraryService {
    String borrowBook(Long bookId);
    String returnBook(Long bookId);
}
