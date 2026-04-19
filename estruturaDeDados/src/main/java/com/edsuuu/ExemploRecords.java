package com.edsuuu;

public class ExemploRecords {

    // Record: Introduzido nas versões mais recentes do Java (Java 14+). 
    // É uma forma curta, concisa e imutável de criar classes que servem apenas para transportar dados (DTOs).
    // O Java já cria automaticamente por debaixo dos panos: 
    // 1. Construtor com todos os parâmetros
    // 2. Getters (com o mesmo nome do atributo)
    // 3. Método toString()
    // 4. Métodos equals() e hashCode()
    public record Pessoa(String nome, int idade) {}

    public static void main(String[] args) {
        System.out.println("=== Exemplo de Records ===");

        // Criando instâncias do record (usando o construtor gerado automaticamente)
        Pessoa p1 = new Pessoa("Carlos", 28);
        Pessoa p2 = new Pessoa("Ana", 25);
        Pessoa p3 = new Pessoa("Carlos", 28); // Tem exatamente os mesmos dados que p1

        // toString() já vem formatado de forma bonita, sem precisarmos escrever nada!
        System.out.println("Dados da Pessoa 1: " + p1);

        // Getters: Note que no record os getters NÃO têm o prefixo 'get' (não é p2.getNome(), é apenas p2.nome())
        System.out.println("Nome da Pessoa 2: " + p2.nome());
        System.out.println("Idade da Pessoa 2: " + p2.idade());

        // equals() gerado automaticamente compara os VALORES dos atributos, não a referência de memória!
        // Retorna true porque ambos têm os valores "Carlos" e 28.
        System.out.println("p1 é igual a p3? " + p1.equals(p3));
        
        // p1.nome = "João"; // Erro! Records são IMUTÁVEIS, seus dados não podem ser alterados após criados.
    }
}
