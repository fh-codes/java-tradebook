public abstract class Trade {

    private String asset;
    private int quantity;
    private double price;

    public Trade(String asset, int quantity, double price) {
        this.asset = asset;
        this.quantity = quantity;
        this.price = price;
    }

    public double value() {
        return quantity * price;
    }

    public String getAsset() {
        return asset;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public abstract String describe();
}