package kz.seisen.services;


import kz.seisen.model.Book;
import kz.seisen.proxy.LibraryInfo;
import kz.seisen.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class LibraryServiceImpl implements LibraryService {
    private final BookRepository bookRepository;
    private final LibraryInfo libraryInfo;

    @Autowired
    public LibraryServiceImpl(BookRepository bookRepository, @Qualifier("log") LibraryInfo libraryInfo) { // @Qualifier("stats")
        this.bookRepository = bookRepository;
        this.libraryInfo = libraryInfo;
    }

    @Override
    public Book borrowBook(Long bookId) {
        Book book = bookRepository.findBookById(bookId);
        bookRepository.removeBook(book);
        libraryInfo.showInfo("Borrowed book: " + book.getTitle());
        return book;
    }

    @Override
    public void returnBook(Book book) {
        bookRepository.addBook(book);
        libraryInfo.showInfo("Returned book: " + book.getTitle());
    }




    public void saveBook(Book book) {
        bookRepository.addBook(book);
        libraryInfo.showInfo("Saved book: " + book.getTitle());
    }








}
