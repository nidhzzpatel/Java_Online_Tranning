package Nidhi.daily.program;

public interface Bank {
    int MINBAL = 5000; // Minimum balance constant
    int DAILY_LIMIT = 25000; // Daily deposit limit

    void deposit(int amt) throws DepositLimitExceedsException;

    void withdraw(int amt) throws InsufficientBalanceException;
}
