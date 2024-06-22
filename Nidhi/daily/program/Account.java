package Nidhi.daily.program;

public class Account implements Bank {
    private int accNo;
    private String name;
    private double balance;

    public Account(int accNo, String name, double balance) {
        this.accNo = accNo;
        this.name = name;
        this.balance = balance;
    }

    public int getAccNo() {
        return accNo;
    }

    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public synchronized void deposit(int amt) throws DepositLimitExceedsException {
        if (amt > DAILY_LIMIT) {
            throw new DepositLimitExceedsException("Daily deposit limit exceeded.");
        } else {
            balance += amt;
            System.out.println("Amount Deposited: " + amt);
        }
    }

    @Override
    public synchronized void withdraw(int amt) throws InsufficientBalanceException {
        if (balance - amt < MINBAL) {
            throw new InsufficientBalanceException("Insufficient balance.");
        } else {
            balance -= amt;
            System.out.println("Withdrawn: Rs." + amt + " Current Balance: Rs." + balance);
        }
    }

    @Override
    public String toString() {
        return "Account [accNo=" + accNo + ", Name=" + name + ", balance=" + balance + "]";
    }
}
