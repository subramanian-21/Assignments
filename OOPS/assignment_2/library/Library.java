package OOPS.assignment_2.library;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Library {
    private String name;
    private String location;
    private List<Book> books;
    Library(String name, String location, Book... books) {
        this.books = new ArrayList<>();
        this.name = name;
        this.location = location;
        this.books.addAll(Arrays.asList(books));
    }
    Library(String name, String location){
        this.name = name;
        this.location = location;
    }
    public void setBooks(Book... books){
        if(this.books == null){
            this.books = new ArrayList<>();
        }
        this.books.addAll(Arrays.asList(books));
    }
    public  String getDetails(){
        return "name : "+name+"\nlocation : "+location+"\n";
    }
    public String getBooks() {
        String out = "";
        for(Book book : books){
            out += book.toString()+"\n";
        }
        return  out;
    }

    public static void main(String[] args) {
        Book b1 = new Book("sample book","none","me", 1000);
        Book b2 = new Book("simple book","none","me", 5000);
        Book b3 = new Book("shutter island","none","me", 1000);


        Library chennai = new Library("chennai library", "chennai", b1,b2,b3);

        System.out.println(chennai.getDetails());
        System.out.println(chennai.getBooks());
    }
}
