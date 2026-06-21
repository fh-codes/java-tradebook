# Java TradeBook — OOP Demo

A Java program modelling a simple trading system,
built to demonstrate core Object-Oriented Programming principles
in a financial markets context.

## Project Structure

| Class          | Description                                                                     |
|----------------|---------------------------------------------------------------------------------|
| `Trade`        | Abstract base class representing a generic trade                                |
| `SpotTrade`    | Immediate buy/sell of an asset at current market price                          |
| `FuturesTrade` | Agreement to trade an asset at a fixed price at a future date                   |
| `OptionsTrade` | Right (not obligation) to trade an asset, with an upfront premium               |
| `TradeBook`    | Manages a collection of trades — prints descriptions and calculates total value |
| `Main`         | Entry point — demonstrates the system with BTC, SOL, and ETH trades             |

## Concepts Demonstrated

- Abstract classes and inheritance
- Encapsulation (private attributes, getters)
- Polymorphism (mixed trade types handled uniformly)
- ArrayLists and iteration
- Multi-file Java project structure

## Sample Output

Spot trade: 10 BTC at £60000.0

SOL futures expiring 2024-12-31, value £2400.0

OptionsTrade: 5 ETH, premium £500.0

Total TradeBook value: £617400.0

## Author - FH