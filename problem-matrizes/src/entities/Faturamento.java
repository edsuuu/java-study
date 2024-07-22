package entities;

import java.util.List;

public class Faturamento {
    private final double menorFaturamento;
    private final double maiorFaturamento;
    private final int diasAcimaMedia;
    private final List<Integer> diasComMenorFaturamento;

    public Faturamento(double menorFaturamento, double maiorFaturamento, int diasAcimaMedia, List<Integer> diasComMenorFaturamento) {
        this.menorFaturamento = menorFaturamento;
        this.maiorFaturamento = maiorFaturamento;
        this.diasAcimaMedia = diasAcimaMedia;
        this.diasComMenorFaturamento = diasComMenorFaturamento;
    }

    public double getMenorFaturamento() {
        return menorFaturamento;
    }

    public double getMaiorFaturamento() {
        return maiorFaturamento;
    }

    public int getDiasAcimaMedia() {
        return diasAcimaMedia;
    }

    public List<Integer> getDiasComMenorFaturamento() {
        return diasComMenorFaturamento;
    }
}
