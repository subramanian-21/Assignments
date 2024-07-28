package OOPS.assignment_3.libraryManagement.book;


import OOPS.assignment_3.libraryManagement.user.User;

import java.util.Scanner;

public class Book {
    private String title;
    public int bookId;
    private String ISBN;
    private String author;
    private int price;
    public static int bookCount = 1;

    public Book(String title,String ISBN, String author, int price){
        this.title = title;
        this.ISBN = ISBN;
        this.author = author;
        this.price = price;
        this.bookId = bookCount;
        bookCount++;
    }
    public String getTitle(){
        return title;
    }

    public String getISBN(){
        return ISBN;
    }
    public String getAuthor(){
        return author;
    }
    public int getPrice(){
        return price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    @Override
    public String toString(){
        return "title : "+title+"\nISBN : "+ISBN+"\nauthor : "+author+"\nprice : "+price+"\n";
    }
}
