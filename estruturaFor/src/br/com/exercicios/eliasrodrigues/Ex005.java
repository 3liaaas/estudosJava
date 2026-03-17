package br.com.exercicios.eliasrodrigues;
import java.util.Scanner;


public class Ex005 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();


        int fatorial = 1;

        for (int i=1;i<=n;i++){
            fatorial = fatorial * i;
        }
        sc.close();
        System.out.println(fatorial);
    }
}

