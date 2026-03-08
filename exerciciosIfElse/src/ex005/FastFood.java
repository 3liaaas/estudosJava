package ex005;
import java.util.Scanner;

public class FastFood {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int codigo = sc.nextInt();
        int quantidade = sc.nextInt();

        double total;
        if (codigo == 1) {
            total = quantidade * 4.0;
        } else if(codigo == 2){
            total = quantidade * 4.50;
        } else if (codigo == 3) {
            total = quantidade * 5.00
        }
        }
    }
}
