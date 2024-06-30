package BankCstudy;

public abstract class BankFactory {
    public abstract SavingAcc getNewSavingAcc(int accNo, String accNm, float accBal, boolean isSalary);

    public abstract CurrentAcc getNewCurrentAcc(int accNo, String accNm, float accBal, float creditLimit);
}