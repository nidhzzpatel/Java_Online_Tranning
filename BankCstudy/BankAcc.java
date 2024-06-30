package BankCstudy;

public abstract class BankAcc {
    private int accNo;
    private String accNm;
    private float accBal;

    public BankAcc(int accNo, String accNm, float accBal) {
        this.accNo = accNo;
        this.accNm = accNm;
        this.accBal = accBal;
    }

    public void withdraw(float amount) {
        if (accBal - amount >= 0) {
            accBal -= amount;
            System.out.println("Withdrawal successful. New balance: " + accBal);
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    public void deposite(float amount) {
        accBal += amount;
        System.out.println("Deposit successful. New balance: " + accBal);
    }

    public int getAccNo() {
        return accNo;
    }

    public String getAccNm() {
        return accNm;
    }

    public float getAccBal() {
        return accBal;
    }

    @Override
    public String toString() {
        return "BankAcc{" +
                "accNo=" + accNo +
                ", accNm='" + accNm + '\'' +
                ", accBal=" + accBal +
                '}';
    }
}