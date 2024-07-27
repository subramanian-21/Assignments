package OOPS.assignment_1;

// 1. Create Book DTO class with attributes like title, ISBN etc.
// Create appropriate instance variables, static variables and methods with appropriate access modifiers.

public class BookDTO {
    private String title;
    private String ISBN;
    private String author;
    private int price;
    public static int bookCount;

    BookDTO(String title,String ISBN, String author, int price){
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
        String obj = "title : "+title+"\nISBN : "+ISBN+"\nauthor : "+author+"\nprice : "+price;
        return obj;
    }

    public static void main(String[] args) {
       BookDTO book1 = new BookDTO("abc","123","none",100);
       BookDTO book2 = new BookDTO("def","456","none",200);
       BookDTO book3 = new BookDTO("ghi","789","none",300);

        System.out.println(book1.toString());
        System.out.println();
        System.out.println(book2.toString());

    }

}
