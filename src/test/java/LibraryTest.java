import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book;

    @Before
    public void before(){
        library = new Library(2000);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
    }

    @Test
    public void canCheckCapcity(){
        assertEquals(2000, library.getCapacity());
    }

    @Test
    public void canAddBook(){
        assertEquals(3, library.checkStocks());
    }

    @Test
    public void canCheckOutBook(){
        library.checkOutBook();
        assertEquals(2, library.checkStocks());
    }

}
