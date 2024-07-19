package application;

import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        List<Employee> lista = new ArrayList<>();

        System.out.print("Quantos funcionarios será cadastrado: ");
        int quantidadeDeFuncionariocadastrado = sc.nextInt();

        for (int i = 0; i < quantidadeDeFuncionariocadastrado; i++) {
            System.out.println();
            System.out.println("Funcionario #" + (i + 1) + ":");
            System.out.print("Digite o Id: ");

            int id = sc.nextInt();

            while (idExisteNaListaFunc(lista, id)) {
                System.out.print("Esse Id já existe, Tente novamente: ");
                id = sc.nextInt();
            }

            System.out.print("Digite o Nome: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Digite o Salario: ");
            Double salary = sc.nextDouble();

            Employee employee = new Employee(id, name, salary);

            lista.add(employee);
        }

        System.out.println();
        System.out.println("Digite o Id do funcionario para fazer o aumento de salario");

        int idFuncionario = sc.nextInt();

//        Integer posicao = procuraIdNaListaFunc(lista, idFuncionario);

//        Segunda maneira de fazer a busca por id

        Employee posicaoAlternada = lista.stream()
                .filter(procuraOID -> procuraOID.getId() == idFuncionario)
                .findFirst()
                .orElse(null);

        if (posicaoAlternada == null) {
            System.out.println("Esse Id Não existe !");
        } else {
            System.out.println();
            System.out.print("Qual será a porcetagem de aumento: ");
            double porcetagem = sc.nextDouble();
//            lista.get(posicao).aumentarSalarioPorPorcentagem(porcetagem);
            posicaoAlternada.aumentarSalarioPorPorcentagem(porcetagem);
        }

        System.out.println();
        System.out.println("Lista dos Funcionarios ");

        for (Employee elementos : lista) {
            System.out.println(elementos);
        }

        sc.close();
    }

    public static Integer procuraIdNaListaFunc(List<Employee> list, int id) {
        for (int index = 0; index < list.size(); index++) {
            if (list.get(index).getId() == id) {
                // ou retorna a posicao, se n tiver retorna null
                return index;
            }
        }
        return null;
    }

    public static boolean idExisteNaListaFunc(List<Employee> list, int id) {
        Employee idDoFuncionarioFunc = list.stream()
                .filter(existeEsseID -> existeEsseID.getId() == id)
                .findFirst()
                .orElse(null);
        return idDoFuncionarioFunc != null;
    }
}
 