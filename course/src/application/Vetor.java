package application;

import java.util.Locale;
import java.util.Scanner;

public class Vetor {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numero do vetor: ");
        int number = sc.nextInt();

        double[] vect = new double[number];

        for (int i = 0; i < number; i++) {
            System.out.println("Digite um numero 0.00");
            vect[i] = sc.nextDouble();
        }

        double soma = 0.0;
        for (int i = 0; i < number; i++) {
            soma += vect[i];
        }

        double media = soma / number;

        System.out.printf("A media é: %.2f%n", media);
        sc.close();

    }
}
