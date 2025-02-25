package kz.seisen.beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class LibraryStatistics {
    public LibraryStatistics() {
        System.out.println("LibraryStatistics bean created (Eager Initialization)");
    }

    public void printStatistics() {
        System.out.println("Total books borrowed: 100");
    }
}