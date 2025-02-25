package kz.seisen;

import kz.seisen.beans.LibraryReport;
import kz.seisen.beans.LibraryStatistics;
import kz.seisen.beans.LibraryTools;
import kz.seisen.config.AppConfig;
import kz.seisen.services.LibraryService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Demonstrate services
        LibraryService defaultService = context.getBean(LibraryService.class);
        System.out.println(defaultService.borrowBook(1L));

//
//        LibraryService advancedService = context.getBean("advanced", LibraryService.class);
//        System.out.println(advancedService.returnBook(2L));









        // Demonstrate singleton beans
        //Eager
        LibraryStatistics statistics = context.getBean(LibraryStatistics.class);
        statistics.printStatistics();


        //Lazy
        LibraryReport report = context.getBean(LibraryReport.class);
        report.generateReport();


        LibraryReport report2 = context.getBean(LibraryReport.class);
        boolean singletonChecker = report2.equals(report);
        System.out.println(singletonChecker);




        // Demostrate prototype
        LibraryTools tools = context.getBean(LibraryTools.class);
        LibraryTools tools2 = context.getBean(LibraryTools.class);
        boolean prototypeChecker = tools.equals(tools2);
        System.out.println(prototypeChecker);

    }
}