package OOPS.assignment_4.product;

public class User {
    String name;
    String username;
    String password;
    private Cart cart;

    User(String name,String username, String password){
        this.name = name;
        this.username = username;
        this.password = password;
        this.cart  = new Cart();
    }


    public  void addToCart(Product... products){
        cart.addToCart(products);
    }
    public void viewCart(){
        cart.viewCart();
    }
    public int getCartPrice(){
        return cart.getTotalPrice();
    }
    public void emptyCart(){
        cart = null;
    }
}
