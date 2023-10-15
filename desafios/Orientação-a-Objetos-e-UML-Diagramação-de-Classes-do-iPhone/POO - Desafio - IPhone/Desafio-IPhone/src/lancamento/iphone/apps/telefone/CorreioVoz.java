package lancamento.iphone.apps.telefone;

public class CorreioVoz implements Telefone {
    public void ligar() {
        System.out.println("Iniciar correio de voz");
    }
    public void atender() {
        System.out.println("Atender Mensagem do Correio de Voz");
    }
    public void recusar() {
        System.out.println("Recusar Mensagem do Correio de Voz");
    }
}
