package BankCstudy;

public class MMBankFactory extends BankFactory {
    @Override
    public SavingAcc getNewSavingAcc(int accNo, String accNm, float accBal, boolean isSalary) {
        return new MMSavingAcc(accNo, accNm, accBal, isSalary);
    }

    @Override
    public CurrentAcc getNewCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
        return new MMCurrentAcc(accNo, accNm, accBal, creditLimit);
    }
}