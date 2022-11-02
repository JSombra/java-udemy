package primeirasaulas.util;

public class CurrencyConverter {
    public static double IOF = 0.06;
    public static double converter(double currentQuote, double totalPurchase){
        return currentQuote * totalPurchase * (1.0 + IOF);
    }

}
