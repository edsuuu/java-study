package application;

import utils.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        double quantidadeRealParaComprarDolar = 200.00;

        double result = CurrencyConverter.resultWithoutIOF(quantidadeRealParaComprarDolar);

        double resultIOF = CurrencyConverter.resultWithIOF(result);

        System.out.println("Resultado Sem Imposto: " + result);
        System.out.println("Resultado Com Imposto: " + resultIOF);

        sc.close();
    }
}
