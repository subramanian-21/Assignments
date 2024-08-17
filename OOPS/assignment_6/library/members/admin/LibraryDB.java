package OOPS.assignment_6.library.members.admin;

import OOPS.assignment_6.library.books.Book;
import OOPS.assignment_6.library.members.user.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LibraryDB {
    private List<Book> books;
    private List<Librarian> librarians;
    private List<User> users;
    public LibraryDB(){
        books = new ArrayList<>();
        librarians = new ArrayList<>();
        Librarian librarian = new Librarian("admin","admin1","passwd");
        librarians.add(librarian);
        users = new ArrayList<>();
    }
    public void addBooks(Book... books){
        this.books.addAll(Arrays.asList(books));
    }
    public void addUser(User... users){
        this.users.addAll(Arrays.asList(users));
    }
    public void addLibrarian(Librarian... librarians){
        this.librarians.addAll(Arrays.asList(librarians));
    }
    public void deleteBook(int bookId){
        books.removeIf(book -> book.bookId == bookId);
    }
    public Book getBookById(int bookId){
        for(Book book : books){
            if(book.bookId == bookId){
                return book;
            }
        }
        return  null;
    }
    public void getById(int bookId){
        int count = 0;
        for(Book book : books){
            if(book.bookId == bookId){
                count++;
                System.out.println(book.toString());
            }
        }
        if(count == 0)
            System.out.println("BookId not found");
    }
    public void getByName(String name){
        int count = 0;
        for(Book book : books){
            if(book.getTitle().startsWith(name)){
                count++;
                System.out.println(book.toString());
            }
        }
        if(count == 0){
            System.out.println("no books found");
        }
    }
    public User verifyUser(String username, String password){
        for(User user : users){
            if(user.login(username,password)){
                return user;
            }
        }
        return null;
    }
    public Librarian verifyLibrarian(String username, String password){
        for(Librarian librarian : librarians){
            if(librarian.login(username,password)){
                return librarian;
            }
        }
        return null;
    }
}
