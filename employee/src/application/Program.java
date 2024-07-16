package application;

import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

/*
Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto). Em
seguida, mostrar os dados do funcionário (nome e salário líquido). Em seguida, aumentar o
salário do funcionário com base em uma porcentagem dada (somente o salário bruto é
afetado pela porcentagem) e mostrar novamente os dados do funcionário. Use a classe
projetada abaixo.
*/

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee funcionario = new Employee();

        funcionario.name = "Valorant";

        System.out.println("Nome do Funcionario: " + funcionario.name);

        funcionario.grossSalary = 6000;

        System.out.println("Salario bruto do funcionario: R$ " + String.format("%.2f", funcionario.grossSalary));

        funcionario.taxas = 1000;

        System.out.println("Imposto: R$ " + String.format("%.2f", funcionario.taxas));

        System.out.println("Funcionario: " + funcionario);

        System.out.println();

        double porcentage = 10;
        funcionario.increaseSalary(porcentage);
        System.out.println("Qual a porcetagem para aumentar o salario " + String.format("%.2f", porcentage) + "%");

        System.out.println();
        System.out.println("Dados Atualizados: " + funcionario);
        sc.close();
    }
}
