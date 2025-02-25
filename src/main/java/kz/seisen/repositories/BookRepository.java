package kz.seisen.repositories;

public interface BookRepository {
    String findBookById(Long id);
    void addBook(Long id, String title, String author);
}
