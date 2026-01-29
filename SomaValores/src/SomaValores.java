import java.util.Scanner;

public class SomaValores {
    public static void main(String[] args){
        System.out.println("Digite um valor inteiro: ");
            Scanner sc1 = new Scanner(System.in);
                int A;
                A = sc1.nextInt();
        System.out.println("Digite outro número inteiro: ");
            Scanner sc2 = new Scanner(System.in);
                int B;
                B = sc2.nextInt();
        int soma;
        soma = A + B;
        System.out.println("A soma entre " + A + " e " + B + " é: " + soma);

        sc1.close();
        sc2.close();
    }
}
