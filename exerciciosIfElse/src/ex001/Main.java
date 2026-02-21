package ex001;
import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Digite um número inteiro, negativo ou positivo: ");
        int x = sc.nextInt();
        if (x < 0){
            System.out.println("este número é negativo");
        }
        else {
            System.out.println("número positivo");
        }
        sc.close();
    }

}
