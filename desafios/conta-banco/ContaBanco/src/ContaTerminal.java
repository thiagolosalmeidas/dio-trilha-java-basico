//TODO: conhecer e importar o a classe Scanner.

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        //TODO: Exibir as mensagens para nosso usuário
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //TODO: obter pela classe Scanner os valores digitados no terminal.

        System.out.println("Digite seu Nome");
        String nomeCliente = scanner.next();

        System.out.println("Digite sua agência");
        String agencia = scanner.next();

        System.out.println("Digite o Número de sua conta");
        int conta = scanner.nextInt();
        
        System.out.println("Digite seu saldo");
        double saldo = scanner.nextDouble();

        //TODO: exibir a mensagem da conta criada.
        System.out.println("#############################");
        System.out.println("Olá, " + nomeCliente + ".");
        System.out.println("Obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua Agência é: " + agencia + "," + " " + "conta: " + conta + ".");
        System.out.println("E seu saldo de: " + "R$ " + saldo + " já está disponível para saque.");
        System.out.println("Tenha um bom dia!");

    }
}
