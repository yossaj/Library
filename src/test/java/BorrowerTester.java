import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BorrowerTester {


    Borrower borrower;
    Library library;
    Book book;

    @Before
    public void before(){
        borrower = new Borrower();
        library = new Library(2000);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
    }

    @Test
    public void canAddBooksToCollection(){
        borrower.takeOutBook(library);
        assertEquals(1, borrower.countBooks());
    }

    @Test
    public void hasACollectionOfBooks(){
        assertEquals(0, borrower.countBooks());
    }


}
