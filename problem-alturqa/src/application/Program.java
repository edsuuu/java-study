package application;

import entities.Person;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas: ");
        int numeroDePessoas = sc.nextInt();
        sc.nextLine();

        Person[] pessoas = new Person[numeroDePessoas];

        for (int i = 0; i < pessoas.length; i++) {
            System.out.println("Nome da Pessoa: " + (i + 1));
            String nome = sc.nextLine();

            System.out.println("Idade da Pessoa: " + (i + 1));
            int idade = sc.nextInt();

            System.out.println("Altura da Pessoa: " + (i + 1));
            double altura = sc.nextDouble();
            sc.nextLine();

            pessoas[i] = new Person(nome, idade, altura);
        }

        double soma = 0.0;

        for (int i = 0; i < numeroDePessoas; i++) {
            soma += pessoas[i].getAltura();
        }

        double mediaAltura = soma / numeroDePessoas;
        System.out.printf("Altura média: %.2f%n", mediaAltura);

        int contarIdade = 0;

        for (int i = 0; i < numeroDePessoas; i++) {
            if (pessoas[i].getIdade() < 16) {
                contarIdade++;
            }
        }

        double porcentagem = contarIdade * 100.0 / numeroDePessoas;

        System.out.printf("Porcentagem de pessoas com menos de 16 anos é de %.1f%%%n", porcentagem);

        for (int i = 0; i < numeroDePessoas; i++) {
            if (pessoas[i].getIdade() < 16) {
                System.out.println(pessoas[i].getNome());
            }
        }


        sc.close();
    }
}
