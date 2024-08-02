package OOPS.assignment_4.product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ShopDb {
    List<Product> products;
    List<Product> electronicProducts;
    List<Product> clothingProducts;
    List<Product> bookProducts;
    List<User> users;
    ShopDb(){
        Product samsungMobile = new ElectronicProduct("Samsung Mobile", "electronics", 10000, 4.5f);
        Product javaBook = new BookProduct("Java Book", "books", 100, 3.5f);
        Product shirt = new ClothingProduct("shirt", "clothes", 2000,1.4f);
        Product iphone = new ElectronicProduct("Iphone", "electronics", 10000, 4.5f);
        Product cBoook = new BookProduct("C Book", "books", 100, 3.5f);
        Product pant = new ClothingProduct("Pant", "clothes", 200,3.4f);
        Product google = new ElectronicProduct("Google pixel", "electronics", 120000, 4.5f);
        Product book = new BookProduct("Javascript", "books", 100, 3.5f);
        Product dress = new ClothingProduct("Socks", "clothes", 2000,5);

        users = new ArrayList<>();
        electronicProducts = new ArrayList<>();
        clothingProducts = new ArrayList<>();
        bookProducts = new ArrayList<>();
        products = new ArrayList<>();

        addBookProducts(javaBook, cBoook, book);
        addElectronicProducts(samsungMobile, iphone, google);
        addClothingProducts(shirt,pant,dress);
        addProducts(javaBook, cBoook, book,samsungMobile, iphone, google,shirt,pant,dress);
    }
    void addElectronicProducts(Product... products){
        electronicProducts.addAll(Arrays.asList(products));
    }
    void addClothingProducts(Product... products){
        clothingProducts.addAll(Arrays.asList(products));
    }
    void addBookProducts(Product... products){
        bookProducts.addAll(Arrays.asList(products));
    }
    void addProducts(Product... product){
        products.addAll(Arrays.asList(product));
    }
    void addUser(User user){
        users.add(user);
    }

    User validateUser(String username, String password){
        for (int i = 0; i < users.size(); i++) {
            String uName = users.get(i).username;
            String passwd =users.get(i).password;

            if(username.equals(uName) && password.equals(passwd)){
                return users.get(i);
            }
        }
        return null;
    }
    Product getProductById(int id){
        for (int i = 0; i < products.size(); i++) {
            if(products.get(i).id == id) return products.get(i);
        }
        return null;
    }
    List<Product> searchByName(String name){
        List<Product> searchedProducts = new ArrayList<>();
        for(int i = 0;i<products.size();i++){
            if(products.get(i).name.toLowerCase().contains(name.toLowerCase())){
                searchedProducts.add(products.get(i));
            }
        }
        return searchedProducts;
    }
}
