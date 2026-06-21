public class Main {
    public static void main(String[] args) {

        SpotTrade spot1 = new SpotTrade("BTC", 10, 60000);

        FuturesTrade futures1 = new FuturesTrade("SOL", 20, 120, "2024-12-31");

        OptionsTrade options1 = new OptionsTrade("ETH", 5, 3000, 500);

        TradeBook tradebook1 = new TradeBook();
        tradebook1.addTrade(spot1);
        tradebook1.addTrade(futures1);
        tradebook1.addTrade(options1);
        tradebook1.printAll();
        System.out.println("Total TradeBook value: £" + tradebook1.totalValue());

    }
}
