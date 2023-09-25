import java.util.Scanner;

public class EquilibrandoSaldo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o saldo atual");
        double saldoAtual = scanner.nextDouble();
        
        System.out.println("Digite o valor do deposito");
        double valorDeposito = scanner.nextDouble();

        System.out.println("Digite o valor da retirada");
        double valorRetirada = scanner.nextDouble();

       //TODO: Calcular o saldo atualizado de acordo com a descrição deste desafio.
       double novoSaldo = saldoAtual + valorDeposito;
       double saque = novoSaldo - valorRetirada;

        
        //TODO: Imprimir o a saída de conforme a tabela de exemplos (uma casa decimal).
        System.out.println(saque);
    }
}