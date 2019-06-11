import java.util.ArrayList;

public class Library {

    private int capacity;
    private ArrayList<Book> books;

    public Library(int capacity){
        this.capacity = capacity;
        this.books = new ArrayList<Book>();
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void addBook(Book book) {
        if( this.capacity > this.checkStocks()) {
            this.books.add(book);
        }
    }

    public int checkStocks() {
        return this.books.size();
    }


    public Book checkOutBook() {
        return this.books.remove(0);
    }
}
