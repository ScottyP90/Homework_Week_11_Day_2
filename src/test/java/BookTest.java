import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BookTest {

    Book book;

    @Before
    public void before() {
        book = new Book("Good Omens", "Terry Pratchett & Neil Gaiman", "Comedy");
    }

    @Test
    public void getName() {
        assertEquals("Good Omens", book.getTitle());
    }

    @Test
    public void getAuthor() {
        assertEquals("Terry Pratchett & Neil Gaiman", book.getAuthor());
    }

    @Test
    public void getGenre() {
        assertEquals("Comedy", book.getGenre());
    }
}
