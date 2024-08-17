package OOPS.assignment_6.library.members.user;

import java.util.Scanner;

class Staff extends User {
    private String department;

    public Staff(String name, String userId,String password, String department) {
        super(name,userId,password);
        this.department = department;
    }
    public void setPassword(Scanner scanner){
        System.out.print("Enter password : ");
        String password = scanner.next();
        super.setPassword(password);
    }
}
