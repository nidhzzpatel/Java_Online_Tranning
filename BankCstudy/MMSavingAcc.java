package BankCstudy;

public class MMSavingAcc extends SavingAcc {
    private static final float MINBAL = 500;
    private float accBal;

    public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalary) {
        super(accNo, accNm, accBal, isSalary);
    }

    @Override
    public void withdraw(float amount) {
        if (accBal - amount >= MINBAL) {
            accBal -= amount;
            System.out.println("Withdrawal successful. New balance: " + accBal);
        } else {
            System.out.println("Insufficient funds. Minimum balance required: " + MINBAL);
        }
    }
}