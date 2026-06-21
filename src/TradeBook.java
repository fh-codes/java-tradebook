import java.util.ArrayList;

public class TradeBook {
    private ArrayList<Trade> trades = new ArrayList<>();

    public TradeBook() {
        trades = new ArrayList<>();
    }

    public void addTrade(Trade trade) {
        trades.add(trade);
    }

    public void printAll() {
        for (Trade trade : trades) {
            System.out.println(trade.describe());
        }
    }

    public double totalValue() {
        double total = 0;
        for (Trade trade : trades) {
            total += trade.value();
        }
        return total;
    }
}
