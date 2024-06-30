package ShopFactory;

public abstract class ShopFactory {
    public abstract PrimeAcc getNewPrimeAccount(int accNo, String accNm, float charges, boolean isPrime);
    public abstract NormalAcc getNewNormalAccount(int accNo, String accNm, float charges, float deliveryCharges);
    public PrimeAcc getNewPrimeAccount(int i, String string, boolean b) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getNewPrimeAccount'");
    }
    public NormalAcc getNewNormalAccount(int i, String string, int j) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getNewNormalAccount'");
    }
}
