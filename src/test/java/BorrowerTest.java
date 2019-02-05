import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BorrowerTest {

    Library library;

    Book book;

    Borrower borrower;

    @Before
    public void before(){
        library = new Library("Alexandria",5);
        book = new Book("Good Omens","Terry Pratchett & Neil Gaiman", "Comedy");
        library.addBook(book);
        borrower = new Borrower("Scotty","26");
    }

    @Test
    public void canPickUpBookFromLibrary() {
        borrower.CheckOutLibraryBook(library);
        assertEquals(1, borrower.bookCount());
        assertEquals(0, library.stockCount());
    }
}
