import java.util.ArrayList;

public class EstudosIniciais {

    public static void comentariosTipos() {
        /*
        byte => 8 bits => -128 a 127
        short => 16 bits => -32.768 a 32.767
        int => 32 bits => -2.147.483.648 a 2.147.483.647
        long => 64 bits => -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807
        // numeros decimais = 1.2, 3.4, 5.6, 7.8, 9.0
        // 5.50
        float => 32 bits => precisão simples
        double => 64 bits> precisão dupla

        String => representar palavras e frases
        char => representar um unico caractere => a, b, c, d
        char meuChar = 'a';
        meuChar = "Fernanda";

        boolean => true ou false
        */
        System.out.println("Comentários de tipos revisados com sucesso.");
    }

    public static void exemplosArrays() {
        // Array iniciado com valores
        int[] numeros = {1, 2, 3, 4, 5};

        // Array iniciado sem valores (apenas com o tamanho definido)
        String[] nomes = new String[5];
        System.out.println("Exemplos de Arrays criados com sucesso.");
    }

    public static void exemploArrayList() {
        // Criando um ArrayList (inicia vazio e pode crescer dinamicamente)
        ArrayList<String> listaNomes = new ArrayList<>();
        
        // Adicionando valores ao ArrayList
        listaNomes.add("Edson");
        listaNomes.add("Fernanda");
        listaNomes.add("Maria");

        System.out.println("Lista original: " + listaNomes);

        // Acessando um elemento (índice 0 é o primeiro)
        String primeiroNome = listaNomes.get(0);
        System.out.println("Primeiro nome da lista: " + primeiroNome);

        // Removendo um elemento
        listaNomes.remove("Maria"); // removendo pelo valor
        listaNomes.remove(0);       // removendo pelo índice (neste caso, "Edson")

        System.out.println("Lista após as remoções: " + listaNomes);

        // Verificando o tamanho da lista
        System.out.println("Tamanho atual da lista: " + listaNomes.size());
    }

    public static void exemplosLoops() {
        System.out.println("--- Exemplo de FOR ---");
        // FOR: usado quando sabemos exatamente quantas vezes queremos repetir
        for (int i = 1; i <= 3; i++) {
            System.out.println("For contador: " + i);
        }

        System.out.println("\n--- Exemplo de WHILE ---");
        // WHILE: checa a condição primeiro e executa enquanto for verdadeira
        int contadorWhile = 1;
        while (contadorWhile <= 3) {
            System.out.println("While contador: " + contadorWhile);
            contadorWhile++;
        }

        System.out.println("\n--- Exemplo de DO-WHILE ---");
        // DO-WHILE: executa o bloco pelo menos uma vez e checa a condição apenas no final
        int contadorDoWhile = 1;
        do {
            System.out.println("Do-While contador: " + contadorDoWhile);
            contadorDoWhile++;
        } while (contadorDoWhile <= 3);

        System.out.println("\n--- Exemplo de FOR-EACH ---");
        // FOR-EACH: excelente para percorrer arrays e coleções facilmente
        String[] nomes = {"Edson", "Fernanda", "Maria"};
        for (String nome : nomes) {
            System.out.println("Nome no For-Each: " + nome);
        }
    }

    public static void exemplosCasts() {
        System.out.println("--- Cast Implícito (Automático) ---");
        // De um tipo com menor capacidade para um maior (ex: int para double)
        int numInt = 10;
        double numDouble = numInt; // O Java converte int para double automaticamente
        System.out.println("Int: " + numInt + " -> Double: " + numDouble);

        System.out.println("\n--- Cast Explícito (Manual) ---");
        // De um tipo com maior capacidade para um menor (pode haver perda de dados)
        double valorDouble = 9.75;
        int valorInt = (int) valorDouble; // Forçamos a conversão, perdendo os decimais (.75)
        System.out.println("Double: " + valorDouble + " -> Int (com cast explícito): " + valorInt);

        System.out.println("\n--- Conversão de String para Tipos Primitivos (Parse) ---");
        // Quando recebemos uma string e queremos transformá-la em número
        String textoNumero = "150";
        int convertidoInt = Integer.parseInt(textoNumero);
        double convertidoDouble = Double.parseDouble("3.14");
        
        System.out.println("String para Int: " + convertidoInt);
        System.out.println("String para Double: " + convertidoDouble);
    }
}
