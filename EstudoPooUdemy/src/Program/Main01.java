package entities;
import java.util.Scanner;

public class Main01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Triangle x, y;

        System.out.println
            ("Enter the measures of triangule X: ");
                xA = sc.nextDouble();
                xB = sc.nextDouble();
                xC = sc.nextDouble();

        System.out.println
            ("Enter the measures of triangule y: ");
                yA = sc.nextDouble();
                yB = sc.nextDouble();
                yC = sc.nextDouble();

                double p = (xA + xB + xC) / 2.0;
                double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));

                p = (yA + yB + yC) / 2.0;
                double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));

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


}
