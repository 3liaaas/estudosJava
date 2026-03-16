package br.com.exercicios.eliasrodrigues;
import java.util.Scanner;

public class Ex004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0;i<n;i++){
            double x = sc.nextDouble();
            double y = sc.nextDouble();

            double resultado = x / y;

            if (y == 0){
                System.out.println("Divisão impossível");
            }
            else {
                System.out.println(resultado);
            }

        }

    }
}