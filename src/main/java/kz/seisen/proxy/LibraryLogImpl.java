package kz.seisen.proxy;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("log")
public class LibraryLogImpl implements LibraryInfo{
    @Override
    public void showInfo(String message) {
        System.out.println("Log info : " + message);
    }
}