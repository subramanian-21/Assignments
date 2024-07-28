package OOPS.assignment_3.libraryManagement;
import OOPS.assignment_3.libraryManagement.admin.Librarian;
import OOPS.assignment_3.libraryManagement.admin.LibraryManagementSystem;
import OOPS.assignment_3.libraryManagement.book.Book;
import OOPS.assignment_3.libraryManagement.user.Student;
import OOPS.assignment_3.libraryManagement.user.User;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("Book Title 1", "ISBN12345", "Author 1", 500);
        Book book2 = new Book("Book Title 2", "ISBN67890", "Author 2", 600);
        Book book3 = new Book("Book Title 3", "ISBN54321", "Author 3", 700);
        Book book4 = new Book("Book Title 4", "ISBN09876", "Author 4", 800);
        Book book5 = new Book("The Great Adventure", "ISBN11111", "Author 5", 550);
        Book book6 = new Book("Mystery of the Lost City", "ISBN22222", "Author 6", 650);
        Book book7 = new Book("Science and the Future", "ISBN33333", "Author 7", 750);
        Book book8 = new Book("Journey to the Unknown", "ISBN44444", "Author 8", 850);
        Book book9 = new Book("Legends of the Ancient World", "ISBN55555", "Author 9", 900);
        Book book10 = new Book("A Tale of Two Cities", "ISBN66666", "Author 10", 1000);

        Librarian librarian = new Librarian("admin2","admin2","passwd1");
        Student user1 =  new Student("subramanian","subramanian21","password","12", "a");



        LibraryManagementSystem library =new LibraryManagementSystem();

        library.addBooks(book1,book2,book3,book4,book5,book6,book7,book8,book9,book10);
        library.addUser(user1);

        library.loginAsUser();

    }
}
