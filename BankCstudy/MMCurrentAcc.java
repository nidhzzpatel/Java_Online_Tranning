package BankCstudy;

public class MMCurrentAcc extends CurrentAcc {

    private int creditLimit;
    private int accBal;

    public MMCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
        super(accNo, accNm, accBal, creditLimit);
    }

    @Override
    public void withdraw(float amount) {
        if (accBal + creditLimit - amount >= 0) {
            accBal -= amount;
            System.out.println("Withdrawal successful. New balance: " + accBal);
        } else {
            System.out.println("Insufficient funds.");
        }
    }
}