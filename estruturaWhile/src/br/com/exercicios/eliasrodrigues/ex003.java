package br.com.exercicios.eliasrodrigues;
import java.util.Scanner;

public class ex003 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int gasolina = 0;
        int diesel = 0;
        int alcool = 0;

        int tipo = sc.nextInt();

        while (tipo != 4){
            if( tipo == 1){
                gasolina++;
            }
            else if(tipo == 2){
                diesel++;
            }
            else if(tipo == 3){
                alcool++;
            }
        }
        sc.close();
    }
}
