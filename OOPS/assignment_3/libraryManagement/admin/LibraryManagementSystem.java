package OOPS.assignment_3.libraryManagement.admin;

import OOPS.assignment_3.libraryManagement.book.Book;
import OOPS.assignment_3.libraryManagement.user.User;

import java.util.List;
import java.util.Scanner;

public class LibraryManagementSystem {

    Scanner scanner = new Scanner(System.in);
    private LibraryDB database;
    public  LibraryManagementSystem(){
        this.database = new LibraryDB();
    }
    private String inputUseId(){
        System.out.print("Enter user id : ");
        String userId = scanner.next();
        System.out.println();
        return  userId;
    }
    private String inputPassword(){

        System.out.print("Enter password : ");
        String password = scanner.next();
        System.out.println();
        return password;
    }
    private int inputBookId(){
        System.out.print("Enter id of book : ");
        int bookId = scanner.nextInt();
        System.out.println();
        return bookId;
    }
    private String inputBookName(){
        System.out.print("Enter name of book : ");
        String bookName = scanner.nextLine();
        System.out.println();
        return  bookName;
    }
    public void borrow(User user, Book book){
        String userId = inputUseId();
        String password = inputPassword();
        user.login(userId, password);
        user.account.addBorrowedBooks(book);
        System.out.println("Borrowed "+book.getTitle());
    }
    public void returnBook(User user, Book book){
        user.account.removeBorrowedBooks(book);
    }
    public void loginAsUser(){
        System.out.println("Login as User...");
        String userId = inputUseId();
        String password = inputPassword();
        User user = database.verifyUser(userId,password);
        if(user == null){
            System.out.println("Invalid user id or password.");
            return;
        }
        System.out.print("Choose Option :\n1 -> Search\n2 -> borrow\n3 -> return\n");
        int option = scanner.nextInt();
        System.out.println();
        switch (option){
            case 1:{
                System.out.print("1 -> Search by id :\n2 -> search by name\n");
                int idOrName = scanner.nextInt();
                if(idOrName == 1){
                    int bookId = inputBookId();
                    database.getById(bookId);
                    return;
                }else if(idOrName == 2){
                    String bookName = inputBookName();
                    database.getByName(bookName);
                    return;
                }else{
                    System.out.println("invalid option");
                    return;
                }
            }
            case 2:{
                int bookId = inputBookId();
                Book book = database.getBookById(bookId);
                if(!checkValid(book)){
                    return;
                }
                user.account.addBorrowedBooks(book);
                break;
            }
            case 3:{
                List<Book> borrowedBooks = user.account.getBorrowedBooks();
                int bookId = inputBookId();
                Book book = null;
                for (Book bb : borrowedBooks){
                    if(bb.bookId == bookId)  book = bb;
                }
                if(!checkValid(book)){
                    return;
                }
                user.account.removeBorrowedBooks(book);
                break;
            } default:{
                System.out.println("Invalid option");
                return;
            }
        }
    }
    private boolean checkValid(Book book){
        if(book == null){
            System.out.println("Invalid book id");
            return false;
        }
        return  true;
    }
    public boolean loginAsAdmin(){
        System.out.println("Admin Login...");
        String userId = inputUseId();
        String password = inputPassword();
        Librarian librarian = database.verifyLibrarian(userId,password);
        if(librarian == null){
            System.out.println("Invalid credentials");
            return false;
        }
        return true;
    }
    public void addUser(User... users){
        database.addUser(users);
    }
    public  void  addLibrarian(Librarian... librarians){
        if(loginAsAdmin()){
            database.addLibrarian(librarians);
        }
    }
    public void  addBooks(Book... books){
        if(loginAsAdmin()){
            database.addBooks(books);
        }
    }
}
