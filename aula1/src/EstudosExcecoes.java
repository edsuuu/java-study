public class EstudosExcecoes {

    public static void simulacaoConversao(String valorTexto) {
        System.out.println("\n--- Tentando converter texto em número: '" + valorTexto + "' ---");
        try {
            // Tenta fazer a conversão que pode dar errado
            int numero = Integer.parseInt(valorTexto);
            System.out.println("Conversão com sucesso! Número: " + numero);
        } catch (NumberFormatException e) {
            // Se der erro (ex: letras em vez de números), o Java cai aqui e não "crasha" o sistema
            System.out.println("ERRO: O texto fornecido não é um número válido!");
        } finally {
            // Esse bloco sempre executa, tenha dado erro ou não.
            // É útil para fechar conexões de banco de dados, arquivos, etc.
            System.out.println("Finalizando a tentativa de conversão (Bloco finally).");
        }
    }

    public static void divisaoComTratamento(int a, int b) {
        System.out.println("\n--- Tentando dividir " + a + " por " + b + " ---");
        try {
            int resultado = a / b;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("ERRO MATEMÁTICO: Não é possível dividir por zero!");
        }
    }
}
