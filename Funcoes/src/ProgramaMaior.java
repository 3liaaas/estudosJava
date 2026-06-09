import java.util.Scanner;

public class ProgramaMaior { // <-- isso aqui já é uma função
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira 3 números inteiros");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            int maior = max(a, b, c);

            mostrarResultado(maior);
        sc.close();
    }

    public static int max(int x, int y, int z) {
        int aux;
        if (x > y && x > z){
            aux = x;
        }
        else if (y > z) {
            aux = y;
        }
        else {
            aux = z;
        }
        return aux;
    }

    public static void mostrarResultado(int value){
        System.out.println("Maior = " + value);
    }

}
