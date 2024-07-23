package application;

//Ler os dados de um trabalhador com N contratos (N fornecido pelo usuário). Depois, solicitar
//do usuário um mês e mostrar qual foi o salário do funcionário nesse mês


import entities.Departament;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");


        System.out.print("Digite o nome do Departamento: ");
        String departamentName = sc.nextLine();
        System.out.println();

        System.out.println("Digite os dados do Trabalhador: ");
        System.out.print("Nome: ");
        String workName = sc.nextLine();

        System.out.print("Nivel: ");
        String workLevelName = sc.nextLine();

        System.out.print("Salario Base: ");
        Double baseSalary = sc.nextDouble();

        Worker trabalhador = new Worker(workName, WorkerLevel.valueOf(workLevelName), baseSalary, new Departament(departamentName));

        System.out.print("Quantos Contratos esse trabalhador vai ter? ");
        int numberContratros = sc.nextInt();

        for (int i = 0; i < numberContratros; i++) {
            System.out.println("Entre com os dados do #" + (1 + i) + " contrato");

            System.out.print("Data (DD/MM/YYYY): ");
            Date contractDate = simpleDateFormat.parse(sc.next());

            System.out.print("Valor por Hora: ");
            double valorPorHora = sc.nextDouble();

            System.out.print("Duração (Horas):");
            int hours = sc.nextInt();

            HourContract contrato = new HourContract(contractDate, valorPorHora, hours);

            trabalhador.addContract(contrato);

        }

        System.out.println();
        System.out.print("Entre com o mes e ano para calcular (MM/YYYY): ");

        String monthAndYear = sc.next();

        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));

        System.out.println("Nome: " + trabalhador.getName());
        System.out.println("Departamento: " + trabalhador.getDepartament().getName());
        System.out.println("O trabalhador ganhou em " + monthAndYear + ": R$" + String.format("%.2f", trabalhador.ganhoIncome(year, month)));

        sc.close();

    }
}
