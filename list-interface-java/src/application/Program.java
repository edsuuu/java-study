package application;

import java.util.*;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Edsu");
        list.add("Elliot");
        list.add("Teste");
        list.add("Javascript");
        // inserir elemento no meio da lista

        list.add(2, "Fsociety");

        System.out.println("Tamanho da minha lista " + list.size());

        list.remove("Teste");

        // da para removerr tanto pelo nome da string quanto pelo index
        System.out.println();

        for (String element : list) {
            System.out.println(element);
        }

        // remover com A primeira letra que começa

        list.removeIf(removerElemento -> removerElemento.charAt(0) == 'E'); // retornar true or false
        System.out.println();
        System.out.println("Mostrando a lista sem os nome q começa pela letra E ");
        for (String element : list) {
            System.out.println(element);
        }

        System.out.println("para mostrar o index do elemento");
        System.out.println("Index " + list.indexOf("Javascript")); // quando nao encotra o elemento retorna -1


        //filtro

        List<String> result = list.stream().filter(filtroElemento -> filtroElemento.charAt(0) == 'J').toList();

        System.out.println();
        System.out.println("Imprimindo com filtro");
        System.out.println();

        for (String filtroElemento : result)  {
            System.out.println(filtroElemento);
        }
        System.out.println("-----------------------------------");

        // para procurar o string pela primeira letra se nao encontrar retorna null

        String name = list.stream().filter(searchElement -> searchElement.charAt(0) == 'F').findFirst().orElse(null);

        System.out.println("o nome é: " + name);

        sc.close();
    }
}
