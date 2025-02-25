package kz.seisen.services;


import kz.seisen.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class LibraryServiceImpl implements LibraryService {
    private final BookRepository bookRepository;

    @Autowired
    public LibraryServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public String borrowBook(String bookId) {
        String book = bookRepository.findBookById(bookId);
        return "Borrowed: " + book;
    }

    @Override
    public String returnBook(String bookId) {
        String book = bookRepository.findBookById(bookId);
        return "Returned: " + book;
    }
}
