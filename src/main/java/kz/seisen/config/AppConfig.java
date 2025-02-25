package kz.seisen.config;

import kz.seisen.beans.LibraryStands;
import kz.seisen.beans.LibraryTables;
import kz.seisen.beans.LibraryTools;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = "kz.seisen")
public class AppConfig {

    //Singleton examples of use: Lazy and eager.
    @Bean
    @Lazy
    public LibraryStands libraryStands() {
        LibraryStands libraryStands = new LibraryStands();
        libraryStands.setStandsAmount(10);
        return libraryStands;
    }


    @Bean
    public LibraryTables libraryTables() {
        LibraryTables libraryTables = new LibraryTables();
        libraryTables.setStandsAmount(10);
        return libraryTables;
    }









    //Prototype example
    @Bean
    @Scope("prototype")
    public LibraryTools libraryTools() {
        LibraryTools libraryTools = new LibraryTools();
        libraryTools.setToolsAmount(12);
        return libraryTools;
    }



}