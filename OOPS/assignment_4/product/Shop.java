package OOPS.assignment_4.product;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Shop {
    User logedInUser;
    private ShopDb database;
    Scanner scanner;
    Shop(){
        scanner = new Scanner(System.in);
        database = new ShopDb();
    }
    private void viewCategoryProduct(int option){
        List<Product> list = new ArrayList<>();
        switch (option){
            case 1 -> list = database.electronicProducts;
            case 2 -> list = database.clothingProducts;
            case 3 -> list = database.bookProducts;
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getDetails());
        }
        if(list.isEmpty()){
            System.out.println("No products Available");
            searchProductsByCategories();
        }
    }
    private void viewAllProducts(){
        System.out.println("---------------Electronics-------------");
        for (int i = 0; i < database.electronicProducts.size(); i++) {
            System.out.println(database.electronicProducts.get(i).getDetails());
        }
        System.out.println("---------------Clothing----------------");
        for (int i = 0; i < database.clothingProducts.size(); i++) {
            System.out.println(database.clothingProducts.get(i).getDetails());
        }
        System.out.println("---------------Books-------------------");
        for (int i = 0; i < database.bookProducts.size(); i++) {
            System.out.println(database.bookProducts.get(i).getDetails());
        }
    }
    private boolean searchProductsByName(String name){
        List<Product> searchList = database.searchByName(name);
        if(searchList.isEmpty()){
            System.out.println("No available products...");
            return false;
        }else {
            for (int i = 0; i < searchList.size(); i++) {
                System.out.println(searchList.get(i).getDetails());
            }
            return true;
        }
    }
     private void searchProductsByCategories(){
        System.out.println("-----------Categories-------------");
        System.out.println("1 -> Electronics");
        System.out.println("2 -> Clothing");
        System.out.println("3 -> Books");
        int opt = scanner.nextInt();
        viewCategoryProduct(opt);
    }
    private  void searchForProducts(){
        System.out.println("1 -> view all products");
        System.out.println("2 -> search products by name");
        System.out.println("3 -> search products by category");
        System.out.println("4 -> back");

        int opt = scanner.nextInt();
        if(opt == 1){
            viewAllProducts();
            searchForProducts();
        }else if(opt == 2){
            System.out.println("Enter search name : ");
            String search = scanner.next();
            if(!searchProductsByName(search)){
                searchForProducts();
            }
            searchForProducts();

        }else if(opt == 3){
            searchProductsByCategories();
            searchForProducts();

        }
        else if(opt == 4){
            visitStore();
        }else {
            System.out.println("Invalid option...");
        }
    }
    private void visitStore(){
        System.out.println("1 -> Search products");
        System.out.println("2 -> Add to cart");
        System.out.println("3 -> Buy Now");
        System.out.println("4 -> My cart");
        System.out.println("5 -> Back");
        System.out.print("Choose option : ");
        int opt = scanner.nextInt();
        switch (opt){
            case 1 : {
                searchForProducts();
                break;
            }
            case 2 : {
                addToCart();
                break;
            }
            case 3 :{
                buyNow();
                break;
            }
            case 4 :{
                viewCart();
                break;
            }
            case 5 :{
                visitStore();
                break;
            }
            default :{
                System.out.println("Invalid Case");
                visitStore();
                break;
            }
        }
    }
    private void createAccount(){
        System.out.println("-------------Create account----------");
        System.out.print("Enter your name : ");
        String name = scanner.next();
        System.out.print("Enter username : ");
        String username = scanner.next();
        System.out.print("Enter password : ");
        String password = scanner.next();
        if(database.validateUser(username,password) == null){
            logedInUser = new User(name,username, password);
            database.addUser(logedInUser);
            System.out.println("Account creation successful");
        }else {
            System.out.println("User Already Exists ");
            login();
        }
    }

    private void login() {
        System.out.println("----------------login------------------");
        System.out.print("Enter username : ");
        String username = scanner.next();
        System.out.print("Enter password : ");
        String password = scanner.next();

        logedInUser = database.validateUser(username,password);
        if(logedInUser == null){
            System.out.println("Invalid username or password...");

        }else {
            System.out.println("Login Successful");
        }
        addToCart();
    }
    private void  verifyUser(){
        System.out.println("1 -> login");
        System.out.println("2 -> create account");
        System.out.println("3 -> back");
        int opt = scanner.nextInt();
        if(opt == 1){
            login();
        }else if(opt == 2){
            createAccount();
        }else if(opt == 3){
            visitStore();
        }else {
            System.out.println("Invalid option");
        }
    }
    private void addToCart(){
        if(logedInUser == null){
            verifyUser();
        }else {
            System.out.println("1 -> Add to cart by entering id ");
            System.out.println("2 -> Browse Products");
            int opt = scanner.nextInt();
            if(opt == 1){
                System.out.print("Enter product Id : ");
                int id = scanner.nextInt();
                Product product = database.getProductById(id);
                logedInUser.addToCart(product);
                addToCart();
            }else {
                searchForProducts();
            }
        }
    }
    public void visit(){
        System.out.println("Welcome to flopkart...");
        System.out.println("1 -> visit store");
        System.out.println("2 -> quit");
        System.out.print("Choose : ");
        int opt = scanner.nextInt();
        if(opt == 1){
            visitStore();
        }else{
            logedInUser = null;
        }
    }
    void viewCart(){
        if(logedInUser == null){
            verifyUser();
        }
        System.out.println("------------"+logedInUser.name+"'s cart--------------");
        logedInUser.viewCart();
        visitStore();
    }
    void buyNow(){
        if(logedInUser == null){
            verifyUser();
        }
        System.out.println("-----------------ebill------------------");

        logedInUser.viewCart();
        System.out.println("pay Now : y/n");
        String opt = scanner.next();
        if(opt.equals("Y") || opt.equals("y")){
            System.out.println("Rs. "+logedInUser.getCartPrice()+" paid successfully");
            visitStore();
        }else{
            System.out.println("Cancelling Transaction");
            visitStore();
        }
    }
}
