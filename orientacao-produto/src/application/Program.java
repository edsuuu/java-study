package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product = new Product();
        System.out.println("Entre com os dados do Produto: ");

//        System.out.print("Nome: ");
//        product.name = sc.nextLine();
        product.name = "Arroz";

//        System.out.print("Preço: ");
//        product.price = sc.nextDouble();
        product.price = 30.00;

//        System.out.print("Quantidade: ");
//        product.quantity = sc.nextInt();
        product.quantity = 10;


//        System.out.println(product.toString()); nao precisa definir tostring
        System.out.println("Setagem de Produto Padrao 'Consulta': " + product);

        int quantity = 20;
        System.out.println();
        System.out.println("Adicionando mais " + quantity + " itens no estoque");
        product.addProductsNoestoque(quantity);

        System.out.println("Setagem de Produto Atualizada: " + product);

        int removeQuantity = 10;
        product.removeProductsDoEstoque(removeQuantity);
        System.out.println("Fazendo uma retirada de " + removeQuantity + " itens no estoque");

        System.out.println("Produtos Atualizados no estoque" + product);
        sc.close();
    }


}
