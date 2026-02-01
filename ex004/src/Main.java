import java.util.Scanner;

public class Main {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Olá humano!");
            System.out.println("Insira seu número de funcionário; ");
                int numFunc = sc.nextInt();
        System.out.println("Quantas horas você trabalhou?");
            String horasFunc = sc.next();
                double salario = 1000.00;
        System.out.printf("Funcinário Nº" + numFunc + ", o seu salário é de: " + "%.2f", salario );

        sc.close();
    }
}
