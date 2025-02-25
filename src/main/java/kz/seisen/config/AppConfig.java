package kz.seisen.config;

import kz.seisen.beans.LibraryTools;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = "kz.seisen")
public class AppConfig {



    //Prototype example
    @Bean
    @Scope("prototype")
    public LibraryTools libraryTools() {
        LibraryTools libraryTools = new LibraryTools();
        libraryTools.setToolsAmount(12);
        return libraryTools;
    }
}