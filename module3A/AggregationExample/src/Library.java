// Library.java
import java.util.ArrayList;

public class Library {
    private String name;
    private ArrayList<Book> books;   // Aggregation: Library "has" Books

    public Library(String name) {
        this.name  = name;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void showBooks() {
        IO.println("Library: " + name);
        for (Book b : books) {
            IO.println("  - " + b.getTitle());
        }
    }
}