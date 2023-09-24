<<<<<<<< HEAD:desafios/DesafioControleFluxo/src/Contador.java
import java.util.Locale;
import java.util.Scanner;


public class Contador {
	public static void main(String[] args) throws ParametrosInvalidosException {
		Scanner terminal = new Scanner(System.in).useLocale(Locale.US);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		
		try {
		//chamando o método contendo a lógica de contagem
		contar(parametroUm, parametroDois);

		}catch ( ParametrosInvalidosException e) {
		//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
		System.out.println("O segundo parâmetro deve ser maior que o primeiro");
		}
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException { 
		if (parametroDois < parametroUm) { 
			throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
		}

		int diferenca = parametroDois - parametroUm;
		int contagem;
		//realizar o for para imprimir os números com base na variável contagem
		//for (int contar = 1; contar <= contagem; contar ++) {
		for (contagem = 1; contagem <= diferenca; contagem ++) {
			System.out.println("Imprimindo o numero " + contagem);
		}
}
}

========
import java.util.Locale;
import java.util.Scanner;


public class Contador {
	public static void main(String[] args) throws ParametrosInvalidosException {
		Scanner terminal = new Scanner(System.in).useLocale(Locale.US);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		
		try {
		//chamando o método contendo a lógica de contagem
		contar(parametroUm, parametroDois);

		}catch ( ParametrosInvalidosException e) {
		//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
		System.out.println("O segundo parâmetro deve ser maior que o primeiro");
		}
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException { 
		if (parametroDois < parametroUm) { 
			throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
		}

		int diferenca = parametroDois - parametroUm;
		int contagem;
		//realizar o for para imprimir os números com base na variável contagem
		//for (int contar = 1; contar <= contagem; contar ++) {
		for (contagem = 1; contagem <= diferenca; contagem ++) {
			System.out.println("Imprimindo o numero " + contagem);
		}
}
}

>>>>>>>> ae01aa5bdb63a8e45c4523b7dc244cae6727d30e:desafios/ContadorPratica/src/Contador.java
