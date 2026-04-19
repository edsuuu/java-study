package com.edsuuu;

// IMPORT: Como a classe 'Calculadora' está em um pacote DIFERENTE (com.edsuuu.utilidades),
// nós precisamos explicitamente importá-la para que o Java saiba onde ela está.
import com.edsuuu.utilidades.Calculadora;

public class ExemploPackages {
    public static void main(String[] args) {
        System.out.println("=== Exemplo de Packages (Pacotes) ===");
        
        System.out.println("Estamos executando a classe ExemploPackages no pacote principal 'com.edsuuu'.");
        System.out.println("Abaixo, vamos chamar uma classe que está na pasta (pacote) 'utilidades':\n");
        
        // Chamando um método de uma classe que está em outro pacote (importada acima)
        int resultado = Calculadora.somar(10, 5);
        
        System.out.println("O resultado da soma usando a classe Calculadora é: " + resultado);
    }
}
