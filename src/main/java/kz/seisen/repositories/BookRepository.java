package kz.seisen.repositories;

import org.springframework.stereotype.Repository;
import java.util.HashMap;
import java.util.Map;

@Repository
public class BookRepository {
    private final Map<String, String> books = new HashMap<>();

    public BookRepository() {
        // Initialize with some books
        books.put("001", "The Great Gatsby");
        books.put("002", "1984");
        books.put("003", "To Kill a Mockingbird");
    }

    public String findBookById(String id) {
        return books.get(id);
    }

    public void addBook(String id, String title) {
        books.put(id, title);
    }
}