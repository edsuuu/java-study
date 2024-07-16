package application;


import entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rectangle tamanhoRetangulo = new Rectangle();
        System.out.println("Enter rectangle width and height:");

        tamanhoRetangulo.width = 3.00;
        tamanhoRetangulo.height = 4.00;
        System.out.println(tamanhoRetangulo);

        System.out.printf("AREA = %.2f%n", tamanhoRetangulo.area());
        System.out.printf("PERIMETER = %.2f%n", tamanhoRetangulo.perimeter());
        System.out.printf("DIAGONAL = %.2f%n", tamanhoRetangulo.diagonal());
        sc.close();
    }
}
