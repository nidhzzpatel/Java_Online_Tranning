package Bank.Nidhi.banking;

public abstract class Account {
    protected double balance;

    public Account(double initialBalance) {
        this.balance = initialBalance;
        Bank.incrementTotalAccounts();
    }

    public abstract void deposit(double amount);

    public abstract void withdraw(double amount);

    public abstract double getBalance();

    public void printBalance() {
        System.out.println("Current balance: " + getBalance());
    }
}
