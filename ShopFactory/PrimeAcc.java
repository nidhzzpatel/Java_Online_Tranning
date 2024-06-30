package ShopFactory;

public abstract class PrimeAcc extends ShopAcc {
    private boolean isPrime;
    private static final float deliveryCharges = 0;

    public PrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
        super(accNo, accNm, charges);
        this.isPrime = isPrime;
    }

    public boolean isPrime() {
        return isPrime;
    }

    @Override
    public void bookProduct(float amount) {
        System.out.println("Product booked successfully for Prime Account.");
    }

    @Override
    public String toString() {
        return "PrimeAcc{" +
               "isPrime=" + isPrime +
               ", deliveryCharges=" + deliveryCharges +
               "} " + super.toString();
    }
}