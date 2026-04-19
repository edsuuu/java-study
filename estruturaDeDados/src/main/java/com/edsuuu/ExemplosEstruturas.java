package com.edsuuu;

import java.util.*;

public class ExemplosEstruturas {

    public static void main(String[] args) {
        System.out.println("=== Exemplo de List (onde usamos o 'get') ===");
        exemploList();

        System.out.println("\n=== Exemplo de LinkedList ===");
        exemploLinkedList();

        System.out.println("\n=== Exemplo de Map ===");
        exemploMap();

        System.out.println("\n=== Exemplo de Set ===");
        exemploSet();

        System.out.println("\n=== Exemplo de Queue ===");
        exemploQueue();

        System.out.println("\n=== Exemplo de Stack (Pilha) ===");
        exemploStack();

        System.out.println("\n=== Exemplo de PriorityQueue (Fila de Prioridade) ===");
        exemploPriorityQueue();
    }

    public static void exemploList() {
        // List: Uma coleção ordenada que permite elementos duplicados.
        // É aqui que usamos bastante o método 'get(index)' para acessar elementos.
        List<String> listaDeNomes = new ArrayList<>();
        listaDeNomes.add("Alice");
        listaDeNomes.add("Bob");
        listaDeNomes.add("Carlos");
        
        System.out.println("Lista original: " + listaDeNomes);
        
        // Pegando um elemento pelo índice (get)
        String segundoNome = listaDeNomes.get(1); 
        System.out.println("Nome no índice 1: " + segundoNome);
    }

    public static void exemploMap() {
        // Map: Uma coleção de pares chave-valor. Chaves são únicas, valores podem se repetir.
        Map<String, Integer> idades = new HashMap<>();
        
        // Inserindo dados (put)
        idades.put("Alice", 25);
        idades.put("Bob", 30);
        idades.put("Carlos", 22);
        
        System.out.println("Map de idades: " + idades);
        
        // Buscando um valor pela chave (get)
        int idadeDoBob = idades.get("Bob");
        System.out.println("Idade do Bob: " + idadeDoBob);
    }

    public static void exemploSet() {
        // Set: Uma coleção que NÃO permite elementos duplicados. Não tem ordem garantida (no HashSet).
        Set<String> frutas = new HashSet<>();
        frutas.add("Maçã");
        frutas.add("Banana");
        frutas.add("Laranja");
        
        // Tentando adicionar uma fruta repetida (será ignorada)
        boolean adicionou = frutas.add("Maçã");
        System.out.println("Conseguiu adicionar 'Maçã' de novo? " + adicionou);
        
        System.out.println("Set de frutas: " + frutas);
    }

    public static void exemploQueue() {
        // Queue: Uma fila (geralmente FIFO - First-In-First-Out, o primeiro a entrar é o primeiro a sair).
        Queue<String> filaDoBanco = new LinkedList<>();
        
        // Adicionando na fila (offer retorna false se a fila tiver limite, add lança exceção)
        filaDoBanco.offer("Cliente 1");
        filaDoBanco.offer("Cliente 2");
        filaDoBanco.offer("Cliente 3");
        
        System.out.println("Fila atual: " + filaDoBanco);
        
        // 1. Olhando quem é o próximo (sem remover)
        // peek(): Retorna null se a fila estiver vazia.
        String proximoPeek = filaDoBanco.peek();
        System.out.println("O próximo (usando peek): " + proximoPeek);
        
        // element(): Lança uma exceção (NoSuchElementException) se a fila estiver vazia.
        String proximoElement = filaDoBanco.element();
        System.out.println("O próximo (usando element): " + proximoElement);
        
        // 2. Removendo o primeiro da fila
        // remove(): Remove e retorna. Lança exceção se a fila estiver vazia.
        String removido = filaDoBanco.remove();
        System.out.println("Atendendo e removendo (usando remove): " + removido);
        System.out.println("Fila após o remove: " + filaDoBanco);
        
        // poll(): Remove e retorna. Retorna null se a fila estiver vazia.
        String atendidoPoll = filaDoBanco.poll();
        System.out.println("Atendendo e removendo (usando poll): " + atendidoPoll);
        System.out.println("Fila após o poll: " + filaDoBanco);
    }

    public static void exemploLinkedList() {
        // LinkedList: Implementa tanto List quanto Deque.
        // É excelente para inserir e remover elementos rapidamente no início ou no fim da lista.
        LinkedList<String> estacoes = new LinkedList<>();
        estacoes.add("Primavera");
        estacoes.add("Verão");
        
        System.out.println("LinkedList inicial: " + estacoes);
        
        // Adicionando no início e no fim (métodos específicos de Deque/LinkedList)
        estacoes.addFirst("Inverno (adicionado no início)");
        estacoes.addLast("Outono (adicionado no fim)");
        
        System.out.println("Após addFirst e addLast: " + estacoes);
        
        // Removendo do início e do fim
        estacoes.removeFirst();
        estacoes.removeLast();
        
        System.out.println("Após remover das pontas: " + estacoes);
    }

    public static void exemploStack() {
        // Stack: Uma pilha que segue a lógica LIFO (Last-In-First-Out, o último a entrar é o primeiro a sair).
        // Embora exista a antiga classe Stack, em Java é recomendado usar a interface Deque (como ArrayDeque) para pilhas.
        Deque<String> historicoNavegador = new ArrayDeque<>();
        
        // Empilhando páginas (push)
        historicoNavegador.push("Página Inicial");
        historicoNavegador.push("Artigo sobre Java");
        historicoNavegador.push("Documentação de Coleções");
        
        System.out.println("Pilha (histórico): " + historicoNavegador);
        
        // Desempilhando a última página que entramos (pop)
        String paginaAtual = historicoNavegador.pop();
        System.out.println("Voltando da página: " + paginaAtual);
        System.out.println("Pilha atual: " + historicoNavegador);
        
        // Espiando a página do topo (peek)
        System.out.println("Página no topo agora: " + historicoNavegador.peek());
    }

    public static void exemploPriorityQueue() {
        // PriorityQueue: Uma fila que, em vez de FIFO, ordena seus elementos de acordo com sua prioridade natural 
        // ou um comparador customizado. Por padrão, a menor ordem natural (como ordem numérica ou alfabética) sai primeiro.
        Queue<Integer> prioridades = new PriorityQueue<>();
        
        // Adicionando fora de ordem
        prioridades.offer(50);
        prioridades.offer(10);
        prioridades.offer(30);
        
        // A ordem interna é baseada em uma árvore 'heap', a visualização com print pode não parecer totalmente ordenada
        System.out.println("PriorityQueue inicial: " + prioridades);
        
        System.out.println("Removendo elementos um por um (do menor pro maior):");
        while (!prioridades.isEmpty()) {
            System.out.println("Processando: " + prioridades.poll());
        }
    }
}
