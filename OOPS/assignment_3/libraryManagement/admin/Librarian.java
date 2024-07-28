package OOPS.assignment_3.libraryManagement.admin;

import OOPS.assignment_3.libraryManagement.book.Book;

import java.util.Scanner;

public class Librarian {
    String name;
    String userId;
    String password;
    public Librarian(String name, String userId, String password){
        this.name = name;
        this.userId = userId;
        this.password = password;
    }
    public boolean login(String userId,String password) {
        return this.userId.equals(userId) && this.password.equals(password);
    }

}
