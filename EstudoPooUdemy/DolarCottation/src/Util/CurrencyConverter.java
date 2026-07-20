package Util;

public class CurrencyConverter {
    public static final double IOF = 6.0;

    public static double conversor(double dollarPrice, double dollarBought) {
        double dollarValue = dollarPrice * dollarBought;
        double result = dollarValue + (dollarValue * IOF / 100);
        return result;
    }
}