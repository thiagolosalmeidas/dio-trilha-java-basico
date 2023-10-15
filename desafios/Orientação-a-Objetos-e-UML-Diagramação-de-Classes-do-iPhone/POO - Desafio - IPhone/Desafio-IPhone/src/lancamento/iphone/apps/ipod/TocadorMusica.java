package lancamento.iphone.apps.ipod;

public class TocadorMusica implements IPod {

    public void tocar() {
        System.out.println("Tocar Musica");
        System.out.println("\"I Want You Back\", de The Jackson 5");
    }

    public void pausar() {
        System.out.println("pausar música");

    }
    public void parar() {
        System.out.println("parar música");
    }

    public void selecionar() {
        System.out.println("selecionar música");

    }

    public void adicionar() {
        System.out.println("adcionar música");

    }

    public void reproduzirLista() {
        System.out.println("reproduzir lista de Músicas");
    }
}
