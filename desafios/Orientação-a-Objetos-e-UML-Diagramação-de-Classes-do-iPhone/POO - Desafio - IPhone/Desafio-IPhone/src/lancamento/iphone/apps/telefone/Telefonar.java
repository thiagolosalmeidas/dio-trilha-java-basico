package lancamento.iphone.apps.telefone;

public class Telefonar implements Telefone {
    public void ligar() {
        System.out.println("Fazendo Ligação");
        System.out.println("Jony Ive, 14089961011, Vice presidente da Apple");

    }
    public void atender() {
        System.out.println("Atender Ligação");
        System.out.println("Phil Schiller");
    }
    public void recusar() {
        System.out.println("Recusar Ligação");
    }
}
