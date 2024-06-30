package BankCstudy;

public class BankApp {
    public static void main(String[] args) {
        BankFactory bankFactory = new MMBankFactory();

        SavingAcc savingAcc = bankFactory.getNewSavingAcc(1, "John Doe", 1000, true);
        CurrentAcc currentAcc = bankFactory.getNewCurrentAcc(2, "Jane Doe", 500, 2000);

        System.out.println("Saving Account:");
        System.out.println(savingAcc);
        savingAcc.withdraw(500);

        System.out.println("Current Account:");
        System.out.println(currentAcc);
        currentAcc.withdraw(1500);
    }
}