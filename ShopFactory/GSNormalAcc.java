package ShopFactory;

public class GSNormalAcc extends NormalAcc {
    public GSNormalAcc(int accNo, String accNm, float deliveryCharges) {
        super(accNo, accNm, 0, deliveryCharges);
    }

    @Override
    public void bookProduct(float amount) {
        System.out.println("Product booked successfully for GSNormalAcc.");
    }

    @Override
    public String toString() {
        return "GSNormalAcc{" +
               "} " + super.toString();
    }
}
