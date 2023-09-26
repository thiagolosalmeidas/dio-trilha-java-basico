import java.text.DecimalFormat;
import java.util.Scanner;

public class BancoApp {
    private static double valorFinal;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
   
        double valorInicial = scanner.nextDouble();
        
     
        double taxaJuros = scanner.nextDouble();
        
        int periodo = scanner.nextInt();
        
        //TODO: Iterar, baseado no período em anos, para calculo do valorFinal com os juros.
        double valorFinal = valorInicial;
        for (int i = 0; i < periodo; i++) {
            valorFinal = valorFinal * (1 + taxaJuros);
        }
        
        // Declara a variável df para arrendondar para duas casas decimais.
        DecimalFormat df = new DecimalFormat("####.00");

        System.out.println("Valor final do investimento: R$ " + df.format(valorFinal));
        
        scanner.close();
    }
}