import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

// Scanner é um tipo de várivel especial, e sc é o nome da variavel

        String x;
        int y;
        double z;
        x = sc.next();
        y = sc.nextInt();
        z = sc.nextDouble();
        System.out.println("Dados Digitados: ");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        sc.close();
    }
}
