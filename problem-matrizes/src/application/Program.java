package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o tamanho da matriz: ");
        int numeroDaMatriz = sc.nextInt();

        int[][] matriz = new int[numeroDaMatriz][numeroDaMatriz];

        for (int linha = 0; linha < numeroDaMatriz; linha++) {
            System.out.println("Digite o numero da linha #" + (linha + 1));
            for (int coluna = 0; coluna < numeroDaMatriz; coluna++) {
            System.out.println("Digite o numero da Coluna #" + (coluna + 1));
                matriz[linha][coluna] = sc.nextInt();
            }
        }

        sc.close();
    }
}
