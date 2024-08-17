package OOPS.assignment_6.library.books;

public class Book {
    public int bookId;
    private String title;
    private int id;
    private String ISBN;
    private String author;
    private int price;
    private static int bookCount;

    Book(String title, String ISBN, String author, int price){
        this.title = title;
        this.ISBN = ISBN;
        this.author = author;
        this.price = price;
        bookCount++;
        id = bookCount;
    }
    public String getTitle(){
        return title;
    }
    public String getISBN(){ return ISBN; }
    public String getAuthor(){
        return author;
    }

    public int getId() {
        return id;
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
