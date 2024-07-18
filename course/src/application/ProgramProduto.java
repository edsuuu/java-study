package application;

import entitites.Product;

import java.util.Locale;
import java.util.Scanner;

public class ProgramProduto {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o tamanho do vetor");
        int n = sc.nextInt();
        Product[] vect = new Product[n];

        for (int i = 0; i < vect.length; i++) {
            sc.nextLine();
            System.out.println("Digite o nome do Produto");
            String name = sc.nextLine();
            System.out.println("Digite o preço do Produto");
            double price = sc.nextDouble();

            vect[i] = new Product(name, price);
        }

        double soma = 0.0;

        for (Product product : vect) {
            soma += product.getPrice();
        }

        double media = soma / vect.length;

        System.out.println("Media preço:" + media);
        sc.close();
    }
}
