public class OptionsTrade extends Trade {
    private double premium;

    public OptionsTrade(String asset, int quantity, double price, double premium) {
        super(asset, quantity, price);
        this.premium = premium;
    }

    public String describe() {
        return "OptionsTrade: " + getQuantity() + " " + getAsset() + ", premium £" + premium;
    }
}
