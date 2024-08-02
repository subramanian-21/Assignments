package OOPS.assignment_4.product;

/**
 *
 * 2. Create an abstract class named Product with methods like getPrice()
 * and getDescription(). Extend the abstract class in classes representing
 * different types of products such as ElectronicsProduct , ClothingProduct ,
 * and BookProduct . Display the details of products and calculate the total
 * price in a shopping cart.
 */
public abstract class Product {
    String name = "mobile";
    String categories;
    int price;
    int id;
    float rating;
    static int count = 0;
    Product(String name,String categories, int price, float rating){
        this.name = name;
        this.id = count;
        this.categories = categories;
        this.price = price;
        this.rating = rating;
        count++;
    }

    public abstract int getPrice();
    public abstract String getDescription();

    public String getDetails(){
        return "{ id : "+id+", name : " +name+", categories : " +categories+", price : " +price+", rating : " +rating+"}\n";
    }
}
