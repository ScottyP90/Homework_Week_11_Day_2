import java.util.ArrayList;

public class Borrower {

    private String name;
    private String age;
    private ArrayList<Book> borrowersBooks;

    public Borrower(String name, String age){
        this.name = name;
        this.age = age;
        this.borrowersBooks = new ArrayList<Book>();
    }

    public int bookCount(){
        return this.borrowersBooks.size();
    }

    public void addBook(Book book){
        this.borrowersBooks.add(book);
    }

    public void CheckOutLibraryBook(Library library){
        Book pickup = library.removeBook();
        this.addBook(pickup);
    }
}
