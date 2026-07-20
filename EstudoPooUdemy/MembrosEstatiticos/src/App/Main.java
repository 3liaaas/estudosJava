package App;

import java.util.Locale;
import java.util.Scanner;
import util.Calculator;
/*fazendo o método na própria classe*/

public class Main {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator(); // Instanciando o Objeto

        System.out.println("Enter radius: ");
        double radius = sc.nextDouble();

        double c = calc.circumference(radius);
        double v = calc.volume(radius);// chamando métodos circumference e volume

        System.out.printf("Circumference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("Pi volume: %.2f%n", calc.PI );

        sc.close();

    }

}

