package OOPS.assignment_2.library;

// 1. Create Book DTO class with attributes like title, ISBN etc.
// Create appropriate instance variables, static variables and methods with appropriate access modifiers.

public class Book {
    private String title;
    private String ISBN;
    private String author;
    private int price;
    public static int bookCount;

    Book(String title, String ISBN, String author, int price){
        this.title = title;
        this.ISBN = ISBN;
        this.author = author;
        this.price = price;
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
        return  "title : "+title+"\nISBN : "+ISBN+"\nauthor : "+author+"\nprice : "+price+"\n";
    }
}
