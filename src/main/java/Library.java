import java.util.ArrayList;

public class Library {

    private String name;
    private ArrayList<Book> bookStock;
    private int capacity;

    public Library(String name, int capacity){
        this.name = name;
        this.bookStock = new ArrayList<Book>();
        this.capacity = capacity;
    }


    public int stockCount() {
        return this.bookStock.size();
    }

    public void addBook(Book book) {
        if(stockCount() < this.capacity){
            this.bookStock.add(book);
        }
    }

    public Book removeBook(){
        return this.bookStock.remove(0);
    }
}
