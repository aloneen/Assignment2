package kz.seisen.services;

import kz.seisen.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("advanced")
public class LibraryServiceAdvancedImpl implements LibraryService {
    private final BookRepository bookRepository;

    @Autowired
    public LibraryServiceAdvancedImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public String borrowBook(Long bookId) {
        String book = bookRepository.findBookById(bookId);
        return "Advanced Borrowed: " + book;
    }

    @Override
    public String returnBook(Long bookId) {
        String book = bookRepository.findBookById(bookId);
        return "Advanced Returned: " + book;
    }
}