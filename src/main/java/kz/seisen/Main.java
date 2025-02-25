package kz.seisen;

import kz.seisen.beans.LibraryStands;
import kz.seisen.model.Book;
import kz.seisen.proxy.*;
import kz.seisen.beans.LibraryTools;
import kz.seisen.config.AppConfig;
import kz.seisen.services.LibraryService;
import kz.seisen.services.LibraryServiceImpl;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Demonstrate services and repository
        LibraryService service = context.getBean(LibraryService.class);

        Book borrowedBook = service.borrowBook(1L);

        service.returnBook(borrowedBook);

        Book book = new Book(1L, "I don't know. Who is joe", "Ilia Topuria");
        service.saveBook(book);


        LibraryService premuimService = context.getBean("prem", LibraryService.class);
        Book premBorrowedBook = premuimService.borrowBook(1L);
        premuimService.returnBook(premBorrowedBook);






        // Demonstrate singleton beans
        //Lazy. It's going to show itself only when you called it.
        LibraryStands libraryStands = context.getBean(LibraryStands.class);


        //Eager. It will show itself first of all (it's constructor)
        LibraryTools libraryTools = context.getBean(LibraryTools.class);



        // Demostrate prototype
        LibraryTools tools = context.getBean(LibraryTools.class);
        LibraryTools tools2 = context.getBean(LibraryTools.class);
        boolean prototypeChecker = tools.equals(tools2);
        System.out.println(prototypeChecker);

    }
}