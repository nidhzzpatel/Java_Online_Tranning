package ShopFactory;

public class GSShoppingApp {
    public static void main(String[] args) {
        ShopFactory shopFactory = new GSShopFactory();
        PrimeAcc primeAcc = shopFactory.getNewPrimeAccount(101, "John Doe", false);
        NormalAcc normalAcc= shopFactory.getNewNormalAccount(102, "Jane Doe", 50);

        System.out.println("Prime Account Details:");
        System.out.println(primeAcc);
        primeAcc.bookProduct(100);

        System.out.println("\nNormal Account Details:");
        System.out.println(normalAcc);
        normalAcc.bookProduct(200);
    }
}
