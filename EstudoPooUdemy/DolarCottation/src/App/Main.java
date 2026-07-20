package App;

import java.util.Scanner;
import java.util.Locale;
import Util.CurrencyConverter;

public class Main {
    public static void main (String [] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("What is the dollar price? ");
        double dollarPrice = sc.nextDouble();

        System.out.println("How many dollars will be bought? ");
        double dollarBought = sc.nextDouble();

        double dollarValue = CurrencyConverter.conversor(dollarPrice,dollarBought);

        System.out.printf("Amount to be paid in reais = R$%.2f", dollarValue);
    }
}
