package OOPS.assignment_7.atm;

class Customer {
    private String name;
    private Account account;

    public Customer(String name, Account account) {
        this.name = name;
        this.account = account;
    }

    public void deposit(double amount) {
        account.deposit(amount);
    }

    public void withdraw(double amount) {
        try {
            account.withdraw(amount);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }

    public void checkBalance() {
        System.out.println("Current balance for " + name + ": " + account.getBalance());
    }
}
