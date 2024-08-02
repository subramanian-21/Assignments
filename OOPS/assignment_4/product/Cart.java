package OOPS.assignment_4.product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cart {
    int price;
    private List<Product> cart;
    Cart(){
        cart = new ArrayList<>();
        price = 0;
    }
    public void addToCart(Product... product){
        for(Product pro : product) {
            price += pro.getPrice();
            cart.add(pro);
        }
    }
    public  int getTotalPrice(){
        return price;
    }
    public void viewCart(){
        for(Product product : cart){
            System.out.println(product.getDetails());
        }
        System.out.println("Total Price : "+getTotalPrice());
    }
}
