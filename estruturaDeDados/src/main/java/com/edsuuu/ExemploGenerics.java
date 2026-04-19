package com.edsuuu;

public class ExemploGenerics {
    
    // Generics (<T>): Permitem que classes, interfaces e métodos operem com diferentes tipos de objetos, 
    // garantindo segurança de tipos (Type Safety) em tempo de compilação.
    
    // Exemplo: Criamos uma 'Caixa' que pode guardar QUALQUER tipo de objeto.
    // 'T' representa um Tipo genérico que será definido apenas na hora de criar o objeto.
    public static class Caixa<T> {
        private T conteudo;

        public void colocar(T item) {
            this.conteudo = item;
        }

        public T retirar() {
            return conteudo;
        }
    }

    public static void main(String[] args) {
        System.out.println("=== Exemplo de Generics ===");

        // Usando a Caixa com o tipo String
        Caixa<String> caixaDeTexto = new Caixa<>();
        caixaDeTexto.colocar("Livro de Java");
        // caixaDeTexto.colocar(100); // Erro de compilação! A caixa só aceita String.
        System.out.println("Conteúdo da caixa de texto: " + caixaDeTexto.retirar());

        // Usando a mesma estrutura de Caixa, mas agora com o tipo numérico (Integer)
        // OBS: Em generics não podemos usar tipos primitivos (int, double), apenas suas classes Wrapper (Integer, Double).
        Caixa<Integer> caixaDeNumeros = new Caixa<>();
        caixaDeNumeros.colocar(100);
        System.out.println("Conteúdo da caixa de números: " + caixaDeNumeros.retirar());
    }
}
