import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    Book book;

    @Before
    public void before(){
        book = new Book("Catch-22", "Joseph Heller", "Satire");
    }

    @Test
    public void hasTitle(){
        assertEquals("Catch-22", book.getTitle());
    }

    @Test
    public void hasAuthor(){
        assertEquals("Joseph Heller", book.getAuthor());
    }

    @Test
    public void hasGenre(){
        assertEquals("Satire", book.getGenre());
    }
}
