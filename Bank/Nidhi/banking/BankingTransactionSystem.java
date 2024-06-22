package Bank.Nidhi.banking;

public class BankingTransactionSystem {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount(1000);
        CheckingAccount checking = new CheckingAccount(500);

        Transaction transaction = new Transaction();

        System.out.println("Initial Balances:");
        savings.printBalance();
        checking.printBalance();

        transaction.performTransaction(savings, 200, "deposit");
        transaction.performTransaction(checking, 100, "withdraw");

        System.out.println("\nBalances after transactions:");
        savings.printBalance();
        checking.printBalance();

        System.out.println("\nTotal number of accounts: " + Bank.getTotalAccounts());
    }
}
