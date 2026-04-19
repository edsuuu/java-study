import veiculos.CarroClasse;
import veiculos.MotoClasse;
import veiculos.VeiculoInterface;
import veiculos.VeiculoMotorizadoAbstrata;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        System.out.println("====== TRABALHANDO COM POLIMORFISMO ======");
        
        // Criamos uma lista baseada na INTERFACE VeiculoInterface
        ArrayList<VeiculoInterface> minhaGaragem = new ArrayList<>();
        
        // Como tanto CarroClasse quanto MotoClasse implementam VeiculoInterface, 
        // podemos adicionar os dois na mesma lista!
        minhaGaragem.add(new CarroClasse("Fusca"));
        minhaGaragem.add(new MotoClasse("Honda CG 160"));
        minhaGaragem.add(new CarroClasse("Civic"));
        
        System.out.println("\n--- Ligando e Abastecendo todos ---");
        // Precisamos ligar e abastecer para eles poderem acelerar
        for (VeiculoInterface veiculo : minhaGaragem) {
            // Verificamos se o veículo é motorizado para acessar métodos específicos da classe abstrata
            if (veiculo instanceof VeiculoMotorizadoAbstrata) {
                VeiculoMotorizadoAbstrata vMotorizado = (VeiculoMotorizadoAbstrata) veiculo;
                // Esse método "ligar" é o método abstrato que nós criamos! Cada um tem seu jeito de ligar.
                vMotorizado.ligar();
                vMotorizado.abastecer(5);
            }
        }

        System.out.println("\n--- Acelerando todos os veículos (POLIMORFISMO) ---");
        for (VeiculoInterface veiculo : minhaGaragem) {
            // AQUI A MÁGICA ACONTECE:
            // O Java sabe exatamente qual acelerar() chamar (do carro ou da moto)
            // sem precisarmos fazer if ou switch!
            veiculo.acelerar();
        }

        System.out.println("\n====== TRATAMENTO DE ERROS (EXCEPTIONS) ======");
        
        // Chamando nossa classe dedicada a estudo de erros genéricos
        EstudosExcecoes.simulacaoConversao("100");
        EstudosExcecoes.simulacaoConversao("ABC"); // Vai cair no catch
        
        EstudosExcecoes.divisaoComTratamento(10, 2);
        EstudosExcecoes.divisaoComTratamento(10, 0); // Vai cair no catch (divisão por zero)

        System.out.println("\n--- Tentando abastecer de forma incorreta ---");
        CarroClasse carroTeste = new CarroClasse("Corolla");
        
        // O bloco TRY tenta executar o código
        try {
            System.out.println("Tentando colocar -10 litros no carro...");
            carroTeste.abastecer(-10);
            
            // Esta linha abaixo nunca será executada porque o método abastecer vai lançar um erro
            System.out.println("Abastecimento concluído com sucesso!");
            
        } catch (IllegalArgumentException e) {
            // O CATCH captura o erro lançado pelo nosso "throw new IllegalArgumentException"
            System.out.println("PEGAMOS UM ERRO: " + e.getMessage());
        }
        
        System.out.println("O programa continua rodando normalmente aqui embaixo (não quebrou)!");
    }
}