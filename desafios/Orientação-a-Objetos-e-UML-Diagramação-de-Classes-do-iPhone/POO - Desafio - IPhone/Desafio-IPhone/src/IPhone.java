import apps.Telefone;
import apps.IPod;
import apps.Safari;

public class IPhone implements IPod, Telefone, Safari {
    @Override
    public void tocar() {
        System.out.println("adicionarMusica");
    }

    @Override
    public void pausar() {
        System.out.println("adicionarMusica");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("adicionarMusica");
    }

    @Override
    public void adicionarMusica(String musica) {
        System.out.println("adicionarMusica");
    }

    @Override
    public void reproduzirLista() {

        System.out.println("reproduzirLista");
    }



}
