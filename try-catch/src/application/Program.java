package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        metodo1();
        System.out.println("End  ");


    }

    public static void metodo1() {
        System.out.println("Metodo 1 começo ");
        System.out.println("Metodo 2 começo ");
        metodo2();

    }

    public static void metodo2() {
        Scanner sc = new Scanner(System.in);
        try {

            System.out.println("Digite os Nomes ");
            String[] vect = sc.nextLine().split(" ");
            System.out.print("Digite o nome da posicao:  ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Posição Inválida");
            e.printStackTrace();
            sc.next();
        } catch (InputMismatchException e) {
            System.out.println("Numero da posicao invalida");
            e.printStackTrace();
        }
        sc.close();
    }
}
