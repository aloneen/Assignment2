package kz.seisen;

import kz.seisen.beans.LibraryReport;
import kz.seisen.beans.LibraryStatistics;
import kz.seisen.config.AppConfig;
import kz.seisen.services.LibraryService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Demonstrate services
        LibraryService defaultService = context.getBean(LibraryService.class);
        System.out.println(defaultService.borrowBook("001"));

        LibraryService advancedService = context.getBean("advanced", LibraryService.class);
        System.out.println(advancedService.returnBook("002"));

        // Demonstrate singleton beans
        LibraryStatistics statistics = context.getBean(LibraryStatistics.class);
        statistics.printStatistics();

        LibraryReport report = context.getBean(LibraryReport.class);
        report.generateReport();


    }
}