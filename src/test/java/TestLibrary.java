import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestLibrary {

    private Library library;
    private Book bookOne;
    private Book bookTwo;
    private Book bookThree;
    private Book bookFour;
    private Book bookFive;

    @Before
    public void before(){
        library = new Library(5);
        bookOne = new Book("Harry Potter", "JK", "Fantasy");
        bookTwo = new Book("Lord of The Rings", "JRR", "Fantasy");
        bookThree = new Book("Lincoln Lawyer", "Michael Connelly", "Crime");
        bookFour = new Book("Romeo and Juliet", "Shakespeare", "Love Story");
        bookFive = new Book("The Power Of Now", "Eckhart Tolle", "New Age");
    }

    @Test
    public void canAddBookToLibraryAndCheckBookTotal(){
        library.addBook(bookOne);
        assertEquals(1, library.totalBooks());
    }

    @Test
    public void canAddMultipleBooksToLibraryAndCheckBookTotal(){
        library.addBook(bookOne);
        assertEquals(1, library.totalBooks());
        library.addBook(bookTwo);
        assertEquals(2, library.totalBooks());
        library.addBook(bookThree);
        assertEquals(3, library.totalBooks());
        library.addBook(bookFour);
        assertEquals(4, library.totalBooks());
        library.addBook(bookFive);
        assertEquals(5, library.totalBooks());
    }

    @Test
    public void checkIfCapacityIsFull(){
        Library fullLibrary = new Library(3);
        fullLibrary.addBook(bookOne);
        fullLibrary.addBook(bookTwo);
        assertEquals(false, fullLibrary.checkIfCapacityFull());
        fullLibrary.addBook(bookThree);
        assertEquals(true, fullLibrary.checkIfCapacityFull());

    }

    @Test
    public void checkIfCanAddBookAfterCapacityFull(){
        Library fullLibrary = new Library(3);
        fullLibrary.addBook(bookOne);
        fullLibrary.addBook(bookTwo);
        fullLibrary.addBook(bookThree);
        fullLibrary.addBook(bookFour);
        fullLibrary.addBook(bookFive);
        assertEquals(3, fullLibrary.totalBooks());
    }

}
