package application;

import entities.Faturamento;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class FaturamentoProgram {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        double[] faturamentoDia1 = {2200.00, 2220.00, 280.00, 2520.00, 3002.00, 210.00, 175.00, 200.00, 250.00, 275.00};

        double[] faturamentoDia2 = {
                2200.00, 2220.00, 280.00, 2520.00, 3002.00, 210.00, 175.00, 200.00, 250.00, 275.00,
                2200.00, 2220.00, 280.00, 2520.00, 3002.00, 210.00, 175.00, 200.00, 250.00, 275.00,
                2200.00, 2220.00, 280.00, 2520.00, 3002.00, 210.00, 175.00, 200.00, 250.00, 275.00
        };

        double[] faturamentoDia3 = {
                2200.00, 2220.00, 280.00, 2520.00, 3002.00, 210.00, 175.00, 200.00, 250.00, 275.00,
                2200.00, 2220.00, 280.00, 2520.00, 3002.00, 210.00, 175.00, 200.00, 250.00, 275.00
        };

        double[] faturamentoMensal = faturamentoTotalDeTodosDias(faturamentoDia1, faturamentoDia2, faturamentoDia3);

        Faturamento resultado = calcularFaturamento(faturamentoMensal);

        System.out.println("Faturamento Diario: ");
        System.out.println();
        System.out.printf("Faturamento dia 1: R$" + String.format("%.2f\n",somaDiaria(faturamentoDia1)));
        System.out.printf("Faturamento dia 2: R$ " + String.format("%.2f\n",somaDiaria(faturamentoDia2)));
        System.out.printf("Faturamento dia 3: R$ " + String.format("%.2f\n",somaDiaria(faturamentoDia3)));
        System.out.println();
        System.out.println("Menor valor de faturamento: " + resultado.getMenorFaturamento());
        System.out.println("Maior valor de faturamento: " + resultado.getMaiorFaturamento());
        System.out.println("Número de dias com faturamento acima da média anual: " + resultado.getDiasAcimaMedia());

        System.out.println("Dias com menor faturamento: " + resultado.getDiasComMenorFaturamento());

        sc.close();
    }

    public static double somaDiaria(double[] arrayDiario) {
        double soma = 0.0;

        for (double valor : arrayDiario) {
            soma += valor;
        }
        return soma;
    }

    public static double[] faturamentoTotalDeTodosDias(double[]... arrays) {
        int tamanhoTotal = 31; // Considera 31 dias no máximo para cada mês
        double[] resultado = new double[tamanhoTotal];

        for (double[] array : arrays) {
            for (int i = 0; i < array.length; i++) {
                if (i < tamanhoTotal) {
                    resultado[i] += array[i];
                }
            }
        }

        return resultado;
    }

    public static Faturamento calcularFaturamento(double[] calculoMensal) {
        double menorFaturamento = Double.MAX_VALUE;
        double maiorFaturamento = Double.MIN_VALUE;
        double totalFaturamento = 0;
        int numeroDiasComFaturamento = 0;

        List<Integer> diasComMenorFaturamento = new ArrayList<>();

        for (int i = 0; i < calculoMensal.length; i++) {
            double valor = calculoMensal[i];
            if (valor > 0) {
                if (valor < menorFaturamento) {
                    menorFaturamento = valor;
                    diasComMenorFaturamento.clear();
                    diasComMenorFaturamento.add(i + 1);
                } else if (valor == menorFaturamento) {
                    diasComMenorFaturamento.add(i + 1);
                }
                if (valor > maiorFaturamento) {
                    maiorFaturamento = valor;
                }
                totalFaturamento += valor;
                numeroDiasComFaturamento++;
            }
        }

        double mediaAnual = (numeroDiasComFaturamento > 0) ? totalFaturamento / numeroDiasComFaturamento : 0;

        int diasAcimaMedia = 0;
        for (double valor : calculoMensal) {
            if (valor > mediaAnual) {
                diasAcimaMedia++;
            }
        }

        return new Faturamento(menorFaturamento, maiorFaturamento, diasAcimaMedia, diasComMenorFaturamento);
    }
}
