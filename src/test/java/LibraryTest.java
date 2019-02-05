import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class LibraryTest {

    Library library;

    Book book;

    @Before
    public void before(){
        library = new Library("Alexandria",5);
        book = new Book("Good Omens","Terry Pratchett & Neil Gaiman", "Comedy");
        library.addBook(book);
    }

    @Test
    public void checkLibraryStockOfBooks() {
        assertEquals(1, library.stockCount());
    }

    @Test
    public void addBookToShelf() {
        library.addBook(book);
        assertEquals(2, library.stockCount());
    }

    @Test
    public void removeBookFromLibrary() {
        library.removeBook();
        assertEquals(0, library.stockCount());
    }
}
