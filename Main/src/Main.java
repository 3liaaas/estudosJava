import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

// Scanner é um tipo de várivel especial, e sc é o nome da variavel

       String s1, s2, s3;
       int x;

       x = sc.nextInt();
       sc.nextLine();
       // este sc.nextLine é para limpar o buffer de leitura, pois com o nextInt, fica um espaço pendent
       s1 = sc.nextLine();
       s2 = sc.nextLine();
       s3 = sc.nextLine();

       System.out.println("Dados Digitados: ");
       System.out.println(s1);
       System.out.println(s2);
       System.out.println(s3);
       sc.close();


    }
}
