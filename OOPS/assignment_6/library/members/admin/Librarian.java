package OOPS.assignment_6.library.members.admin;

public class Librarian {
    String name;
    String userId;
    String password;
    public Librarian(String name, String userId, String password){
        this.name = name;
        this.userId = userId;
        this.password = password;
    }
    public boolean login(String userId,String password) {
        return this.userId.equals(userId) && this.password.equals(password);
    }

}
