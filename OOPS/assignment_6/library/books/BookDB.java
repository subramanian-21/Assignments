package OOPS.assignment_6.library.books;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BookDB {
    private List<Book> books = new ArrayList<>();;
    public BookDB(){
        books = new ArrayList<>();
    }
    public void addBook(Book... books){
        this.books.addAll(Arrays.asList(books));
    }
    public void removeBook(int bookId) {
        books.removeIf((book)->book.getId() == bookId);
    }
}
