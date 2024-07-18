package application;

import entities.Aluguel;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // quantidade total de quartos
        Aluguel[] quartos = new Aluguel[10];

        System.out.print("Quantos quartos serão alugados? ");

        int quantidadeDeQuartos = sc.nextInt();

        sc.nextLine();

        for (int i = 1; i <= quantidadeDeQuartos; i++) {
            System.out.println("Aluguel #" + i + ":");

            System.out.print("Nome da Pessoa: ");
            String name = sc.nextLine();

            System.out.print("Email da Pessoa: ");
            String email = sc.nextLine();

            int numeroDoQuarto;
            while (true) {
                System.out.print("Quarto: ");
                numeroDoQuarto = sc.nextInt();
                sc.nextLine();

                if (numeroDoQuarto < 0 || numeroDoQuarto >= quartos.length) {
                    System.out.println("Número de quarto inválido. Tente novamente.");
                } else if (quartos[numeroDoQuarto] != null) {
                    System.out.println("Quarto já ocupado. Por favor, escolha outro.");
                } else {
                    break;
                }
            }

            quartos[numeroDoQuarto] = new Aluguel(name, email);
        }

        System.out.println();
        System.out.println("Quartos ocupados:");

        for (int i = 0; i < quartos.length; i++) {
            if (quartos[i] != null) {
                System.out.println("Quarto " + i + " alugado por: " + quartos[i]);
            }
        }

        sc.close();
    }
}
