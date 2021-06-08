import java.util.ArrayList;

public class Library {

    private ArrayList<Book> bookCollection;
    private int capacity;

    public Library(int capacity){
        this.capacity = capacity;
        this.bookCollection = new ArrayList<>();
    }

    public int totalBooks() {
        return this.bookCollection.size();
    }

    public boolean checkIfCapacityFull() {
        if(this.totalBooks() == this.capacity){
            return true;
        }
        return false;
    }

    public void addBook(Book book) {
        if(!this.checkIfCapacityFull()){
            this.bookCollection.add(book);
        }
    }
}
