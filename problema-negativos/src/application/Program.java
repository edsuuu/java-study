package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros voce vai digitar");
        int numeroDeVetor = sc.nextInt();

        int[] vetor = new int[numeroDeVetor];

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite um numero");
            vetor[i] = sc.nextInt();
        }

        System.out.println("Numeros negativos são ");
        for (int numeroNegativo : vetor) {
            if (numeroNegativo < 0) {
                System.out.println(numeroNegativo);
            }
        }

        sc.close();

    }
}
