public class SpotTrade extends Trade {

    public SpotTrade(String asset, int quantity, double price){
        super(asset, quantity, price);
    }

    public String describe () {
        return "Spot trade: " + getQuantity() + " " + getAsset() + " at £" + getPrice();
    }
}
