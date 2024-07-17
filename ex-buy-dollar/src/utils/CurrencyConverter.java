package utils;

public class CurrencyConverter {
    public static final double DOLAR = 5.43;
    public static final double IOF =  6.00;

    public static double resultWithoutIOF(double quantidadeRealParaComprarDolar) {
        return quantidadeRealParaComprarDolar * DOLAR;
    }

    public static double resultWithIOF(double result) {
        return result + (result * (IOF / 100.0));
    }
}
