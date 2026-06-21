public class FuturesTrade extends Trade {
    private String expiry;

    public FuturesTrade(String asset, int quantity, double price, String expiry) {
        super(asset, quantity, price);
        this.expiry = expiry;
    }

    public String describe() {
        return getAsset() + " futures expiring " + expiry + ", value £" + value();
    }
}
