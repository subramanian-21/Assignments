package OOPS.assignment_6.library.members.user;

import OOPS.assignment_6.library.books.Book;

import java.util.ArrayList;
import java.util.List;

public class Account {
    List<Book> borrowedBooks;
    int reservedBooks;
    int returnedBooks;
    int lostBooks;
    int fineAmount;
    Account(){
        borrowedBooks = new ArrayList<>();
    }
    public void addBorrowedBooks(Book book){
        borrowedBooks.add(book);
    }
    public void removeBorrowedBooks(Book book){
        System.out.print("Fine amout = "+fineAmount);
        if(fineAmount != 0){
            System.out.print("pay fine amount of rs : "+fineAmount);
        }
        borrowedBooks.removeIf(b -> b.bookId == book.bookId);
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    int calculateFine(){
        return fineAmount;
    }
}
