package by.metelsky.aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {
    @Override
    public void getBook(){
        System.out.println("We take a book from UniLibrary");
    }
    protected String returnBook(){
        System.out.println("We return book to UniLibrary");
        return "OK";
    }
    public void getMagazine(){
        System.out.println("We take a magazine from UniLibrary");
    }
}
