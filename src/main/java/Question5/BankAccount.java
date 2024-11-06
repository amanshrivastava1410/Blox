package Question5;

public class BankAccount {
    private String accId;
    private double balance;

    public BankAccount(String accId, double initialBalance) {
        this.accId = accId;
        this.balance = initialBalance;
    }

    public synchronized void deposit(double amount) {
        balance += amount;
    }

    public synchronized boolean withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public String getAccountId() {
        return accId;
    }

    public double getBalance() {
        return balance;
    }
}
