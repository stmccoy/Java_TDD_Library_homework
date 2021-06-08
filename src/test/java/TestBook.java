import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class TestBook {

    private Book book;

    @Before
    public void before(){
        book = new Book("Harry Potter", "JK", "Fantasy");
    }

    @Test
    public void bookHasATitle(){
        assertEquals("Harry Potter", book.getTitle());
    }

    @Test
    public void bookHasAnAuthor(){
        assertEquals("JK", book.getAuthor());
    }

    @Test
    public void bookHasAGenre(){
        assertEquals("Fantasy", book.getGenre());
    }

}
