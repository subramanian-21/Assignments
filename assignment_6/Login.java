package assignment_6;
class Main{
    /**
     * 1. Write a java program to mimic login of a person (Get username and
     *  password from the user and authenticate). The username and password should 
     * be hardcoded in a static block.
     */
    public static void main(String[] args) {
        Login login = new Login();

        login.login("subramanian", "123344");
    }
}
class Login {
    private static String username;
    private static String password;

    static{
        username = "hello123";
        password = "12345678";
    }

    public void login(String username,String password){

        if(username.equals(Login.username) && password.equals(Login.password)){
            System.out.println("Login Successful");
        }else if(username.equals(Login.username) || password.equals(Login.password)){
            System.out.println("Username or Password incorrect");
        }else {
            System.out.println("Login Failed");
        }
    }
    
}
