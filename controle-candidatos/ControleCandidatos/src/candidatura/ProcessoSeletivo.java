package candidatura;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {

    }
    static void selecaoCandidatos() {
// Array com a lista de candidatos
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};            
        int candidatosSelecionados = 0;
        int candidatoAtual=0;
        double salarioBase=2000.0;
        while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
        String candidato = candidatos[candidatoAtual];
        double salarioPretendido = valorPretendido();

        System.out.println("O candidato" + candidato + "Solicitou este valor de salário" + salarioPretendido);
                if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato" + candidato + "foi selecionado para a vaga");
        candidatosSelecionados++;        

            }
        candidatoAtual++;
        } 
    }

//  Método que simula o valor pretendido
static double valorPretendido() {
    return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
}
