package BankCstudy;

public abstract class CurrentAcc extends BankAcc {
    private float creditLimit;
    private float accBal;

    public CurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
        super(accNo, accNm, accBal);
        this.creditLimit = creditLimit;
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

    @Override
    public String toString() {
        return "CurrentAcc{" +
                "creditLimit=" + creditLimit +
                ", accNo=" + getAccNo() +
                ", accNm='" + getAccNm() + '\'' +
                ", accBal=" + getAccBal() +
                '}';
    }
}