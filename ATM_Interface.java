public class ATM {
    private BankAccount account;

    public ATM(BankAccount account) {
        this.account = account;
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount. Please enter a positive amount.");
        } else if (amount > account.getBalance()) {
            System.out.println("Insufficient balance. Please enter an amount less than or equal to your current balance.");
        } else {
            account.setBalance(account.getBalance() - amount);
            System.out.println("Withdrawal successful. Your new balance is: " + account.getBalance());
        }
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount. Please enter a positive amount.");
        } else {
            account.setBalance(account.getBalance() + amount);
            System.out.println("Deposit successful. Your new balance is: " + account.getBalance());
        }
    }

    public void checkBalance() {
        System.out.println("Your current balance is: " + account.getBalance());
    }
}

public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
