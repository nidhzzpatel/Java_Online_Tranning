package ShopFactory;

public abstract class NormalAcc extends ShopAcc {
    private float deliveryCharges;

    public NormalAcc(int accNo, String accNm, float charges, float deliveryCharges) {
        super(accNo, accNm, charges);
        this.deliveryCharges = deliveryCharges;
    }

    public float getDeliveryCharges() {
        return deliveryCharges;
    }

    @Override
    public void bookProduct(float amount) {
        System.out.println("Product booked successfully for Normal Account. Delivery Charges: " + deliveryCharges);
    }

    @Override
    public String toString() {
        return "NormalAcc{" +
               "deliveryCharges=" + deliveryCharges +
               "} " + super.toString();
    }
}
