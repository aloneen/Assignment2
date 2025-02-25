package kz.seisen.proxy;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class LibraryReportImpl implements LibraryInfo {
    @Override
    public void showInfo(String message) {
        System.out.println(" REPORT :" + message);
    }
}