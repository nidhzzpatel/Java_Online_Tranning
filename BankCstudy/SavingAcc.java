package BankCstudy;

public abstract class SavingAcc extends BankAcc {
    private boolean isSalary;
    private float accBal;
    private static final float MINBAL = 500;

    public SavingAcc(int accNo, String accNm, float accBal, boolean isSalary) {
        super(accNo, accNm, accBal);
        this.isSalary = isSalary;
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

    @Override
    public String toString() {
        return "SavingAcc{" +
                "isSalary=" + isSalary +
                ", MINBAL=" + MINBAL +
                ", accNo=" + getAccNo() +
                ", accNm='" + getAccNm() + '\'' +
                ", accBal=" + getAccBal() +
                '}';
    }
}