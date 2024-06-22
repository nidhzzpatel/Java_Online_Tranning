package Nidhi.daily.program;

public class AccountThread extends Thread {
    private Account acc;
    private int amt;

    public AccountThread(Account acc, int amt) {
        this.acc = acc;
        this.amt = amt;
        start(); // Start the thread immediately upon creation
    }

    @Override
    public void run() {
        try {
            if (amt > 0) {
                acc.deposit(amt);
            } else {
                acc.withdraw(-amt);
            }
        } catch (DepositLimitExceedsException | InsufficientBalanceException e) {
            System.err.println(e.getMessage());
        }
    }
}
