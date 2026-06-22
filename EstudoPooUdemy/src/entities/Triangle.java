package entities;

public class Triangle {
    public double a;
    public double b;
    public double c;

    /*Criando um método */
    public double area() {
        double p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}


/*
* Triangle é um tipo, que também é um objeto, X e Y são váriaveis
* que apontam para um objeto, e esse objeto é composto por atributos
* (citados acima)
* */

/*
* O Prefixo "public" indica que o atributo ou método
* pode ser usado em outros arquivos
*
* "double" é o tipo de dado que este método retorna, se o método
* não retorna nada, usa-se a palavra "void"
 * */