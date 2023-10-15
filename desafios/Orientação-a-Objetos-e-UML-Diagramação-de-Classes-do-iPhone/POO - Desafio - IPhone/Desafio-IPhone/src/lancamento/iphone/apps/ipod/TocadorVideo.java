package lancamento.iphone.apps.ipod;

public class TocadorVideo implements IPod {
    public void tocar() {

        System.out.println("Tocar vídeo");
    }

    public void pausar() {
        System.out.println("pausar vídeo");

    }
    public void parar() {
        System.out.println("parar vídeo");
    }

    public void selecionar() {
        System.out.println("selecionar vídeo");

    }

    public void adicionar() {
        System.out.println("adcionar vídeo");

    }

    public void reproduzirLista() {
        System.out.println("reproduzir lista de video");
    }
}
