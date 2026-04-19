package com.edsuuu;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExemploStreamAPI {
    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("Ana", "João", "Carlos", "Beatriz", "Alberto");

        System.out.println("=== Exemplo de Stream API ===");
        
        // A Stream API permite processar coleções de dados de forma declarativa (parecido com SQL ou linguagens funcionais).
        
        // Exemplo 1: Filtrar nomes que começam com 'A' e colocar em maiúsculo
        List<String> nomesComA = nomes.stream()
                .filter(nome -> nome.startsWith("A"))   // Filtra
                .map(String::toUpperCase)               // Transforma em maiúsculo
                .collect(Collectors.toList());          // Coleta de volta para uma Lista
                
        System.out.println("Nomes originais: " + nomes);
        System.out.println("Nomes que começam com 'A' (maiúsculos): " + nomesComA);

        // Exemplo 2: Contar quantos nomes têm mais de 4 letras
        long qtdNomesGrandes = nomes.stream()
                .filter(nome -> nome.length() > 4)
                .count();                               // Apenas conta, não coleta os elementos
                
        System.out.println("Quantidade de nomes com mais de 4 letras: " + qtdNomesGrandes);
    }
}
