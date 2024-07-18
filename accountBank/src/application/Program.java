package application;

import entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Envie o número da conta: ");
        int numeroDaConta = sc.nextInt();

        sc.nextLine();

        System.out.println("Envie o nome do titular: ");
        String nomeDaPessoa = sc.nextLine();

        System.out.println("Quer fazer um depósito inicial (y/n)? ");
        char resposta = sc.next().charAt(0);

        Account account;

        if (resposta == 'y') {
            System.out.println("Digite o valor do depósito inicial: ");
            double depositoInicial = sc.nextDouble();
            account = new Account(numeroDaConta, nomeDaPessoa, depositoInicial);
        } else {
            account = new Account(numeroDaConta, nomeDaPessoa);
        }

        System.out.println("\nDados da conta:");
        System.out.println(account);

        System.out.print("\nDigite um valor de depósito: ");
        double deposito = sc.nextDouble();
        account.deposito(deposito);
        System.out.println("Dados da conta atualizados:");
        System.out.println(account);

        System.out.print("\nDigite um valor de saque: ");
        double saque = sc.nextDouble();

        account.saque(saque);
        System.out.println("Dados da conta atualizados:");
        System.out.println(account);

        sc.close();
    }
}
