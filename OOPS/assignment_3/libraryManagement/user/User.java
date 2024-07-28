package OOPS.assignment_3.libraryManagement.user;

import java.util.Scanner;

public class User {
    public String name;
    private String userId;
    private String password;
    public Account account;

    User(String name, String userId,String password) {
        this.name = name;
        this.userId = userId;
        this.password = password;
        account = new Account();
    }

    void setPassword(String password) {
        this.password = password;
    }

    boolean isPasswordSet() {
        return !password.isEmpty();
    }

    public boolean login(String userId,String password) {
        return this.userId.equals(userId) && this.password.equals(password);
    }
}
