package Program;
import java.util.Scanner;

import entities.Triangle;

public class Main01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println
            ("Enter the measures of triangule X: ");
                x.a = sc.nextDouble();
                x.b = sc.nextDouble();
                x.c = sc.nextDouble();

        System.out.println
            ("Enter the measures of triangule y: ");
                y.a = sc.nextDouble();
                y.b = sc.nextDouble();
                y.c = sc.nextDouble();

                double p = (x.a + x.b + x.c) / 2.0;
                double areaX = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));

                p = (y.a + y.b + y.c) / 2.0;
                double areaY = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));

                System.out.printf("triângulo X area: %.4f%n", areaX);
                System.out.printf("triângulo y area: %.4f%n", areaY);

                if(areaX > areaY) {
                    System.out.println("Larer area: X");
                }
                else {
                    System.out.println("Larer area: Y");
                }

                sc.close();

    }

    /*
    *
    *Triângulo é uma entidade com três atributos: a, b, c.
    *
    * Estamos usando três variáveis distintas para representar cada triângulo:
    *
    * double aX, bX, cX, aY, bY, cY;
    *
    * Para melhorar isso, vamos usar uma CLASSE para representar um triângulo.
    * */

    /*
    * Instanciação
    * Váriaveis Clássicas são estáticas, ficam na área da memória "Stack"
    * Váriaveis Dinâmicas ficam na área Heap da memória
    * */

}
