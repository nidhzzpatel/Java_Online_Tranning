package ShopFactory;

public class GSPrimeAcc extends PrimeAcc {
    private static final float charges = 0;

    public GSPrimeAcc(int accNo, String accNm, boolean isPrime) {
        super(accNo, accNm, charges, isPrime);
    }

    @Override
    public void bookProduct(float amount) {
        System.out.println("Product booked successfully for GSPrimeAcc.");
    }

    @Override
    public String toString() {
        return "GSPrimeAcc{" +
               "charges=" + charges +
               "} " + super.toString();
    }
}
