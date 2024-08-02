package OOPS.assignment_4.product;

public class BookProduct extends Product{
    BookProduct(String name,String categories, int price, float rating){
        super(name,categories,price,rating);
    }
    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String getDescription() {
        return "This is a book product";
    }
}
