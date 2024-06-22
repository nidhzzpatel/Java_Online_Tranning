package Bank.Nidhi.banking;


public class Transaction {
    private final double transactionFee = 2.5;

    public final void performTransaction(Account account, double amount, String type) {
        switch (type) {
            case "deposit":
                account.deposit(amount);
                account.withdraw(transactionFee); // Deduct transaction fee
                break;
            case "withdraw":
                account.withdraw(amount + transactionFee); // Deduct amount and transaction fee
                break;
            default:
                System.out.println("Invalid transaction type");
        }
    }
}
