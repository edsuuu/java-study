package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com os dados do Produto: ");

        String name = "Arroz";

        double price = 30.00;

//        int quantity = 10;

        Product product = new Product(name, price);

        product.setName("Feijao");
        System.out.println("nome atualizado " + product.getName());
        System.out.println("Setagem de Produto Padrao 'Consulta': " + product);

        int addquantity = 20;

        System.out.println("Adicionando mais " + addquantity + " itens no estoque");
        product.addProductsNoestoque(addquantity);

        System.out.println("Setagem de Produto Atualizada: " + product);

        int removeQuantity = 10;
        product.removeProductsDoEstoque(removeQuantity);
        System.out.println("Fazendo uma retirada de " + removeQuantity + " itens no estoque");

        System.out.println("Produtos Atualizados no estoque " + product);
        sc.close();
    }


}
