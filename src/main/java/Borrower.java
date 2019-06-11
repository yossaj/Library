import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> collection;


    public Borrower(){
        this.collection = new ArrayList<Book>();
    }

    public int countBooks(){
        return this.collection.size();
    }

    public void takeOutBook(Library library) {
        Book loanBook = library.checkOutBook();
        this.collection.add(loanBook);
    }


}
