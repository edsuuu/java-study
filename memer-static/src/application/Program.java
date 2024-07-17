package application;

import utils.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        // se os metodos nao forem estaticos eu preciso instanciar a classe abaixo
//        Calculator calculator = new Calculator();


        double radius = 3.0;
        System.out.println("Valor radius: " + radius);

        double c = Calculator.circumference(radius);
        double v = Calculator.volume(radius);

        System.out.println("Circuferencia: " + c);
        System.out.println("Volume: " + v);
        System.out.println("Valor do PI: " + Calculator.PI);

        sc.close();

    }


}
