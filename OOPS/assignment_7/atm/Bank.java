package OOPS.assignment_7.atm;

class Bank {
    public static void main(String[] args) {
        Account acc1 = new Account("1", 1000);
        Customer cust1 = new Customer("abc", acc1);

        cust1.checkBalance();
        cust1.deposit(500);
        cust1.checkBalance();

        cust1.withdraw(2000);
        cust1.checkBalance();

        // Withdraw a valid amount
        cust1.withdraw(500);
        cust1.checkBalance();
    }
}
