package kz.seisen.services;


import kz.seisen.model.Book;
import kz.seisen.proxy.LibraryInfo;
import kz.seisen.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;


@Service("prem")
@Qualifier("premium")
public class LibraryPremiumServiceImpl implements LibraryService {

    private final BookRepository bookRepository;
    private final LibraryInfo libraryInfo;

    @Autowired
    public LibraryPremiumServiceImpl(BookRepository bookRepository, LibraryInfo libraryInfo) { // @Qualifier("stats")
        this.bookRepository = bookRepository;
        this.libraryInfo = libraryInfo;
    }




    @Override
    public Book borrowBook(Long bookId) {
        Book book = bookRepository.findBookById(bookId);
        bookRepository.removeBook(book);
        libraryInfo.showInfo(" Premium Borrowed book: " + book.getTitle());
        return book;
    }

    @Override
    public void returnBook(Book book) {
        bookRepository.addBook(book);
        libraryInfo.showInfo(" Premium Returned book: " + book.getTitle());
    }

    @Override
    public void saveBook(Book book) {
        bookRepository.addBook(book);
        libraryInfo.showInfo(" Premium Saved book: " + book.getTitle());
    }
}
