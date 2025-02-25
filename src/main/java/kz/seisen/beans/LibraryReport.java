package kz.seisen.beans;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class LibraryReport {
    public LibraryReport() {
        System.out.println("LibraryReport bean created (Lazy Initialization)");
    }

    public void generateReport() {
        System.out.println("Generating library report...");
    }
}