import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
// Scanner é um tipo de várivel especial, e sc é o nome da variavel
        double x;
        x = sc.nextInt();
        System.out.println("Você digitou: " + x);
        sc.close();
    }
}
