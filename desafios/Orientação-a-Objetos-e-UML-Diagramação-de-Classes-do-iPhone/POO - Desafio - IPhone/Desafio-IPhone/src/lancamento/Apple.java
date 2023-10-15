package lancamento;

import lancamento.iphone.IPhone;
import lancamento.iphone.apps.ipod.IPod;
import lancamento.iphone.apps.ipod.TocadorMusica;
import lancamento.iphone.apps.safari.Pagina;
import lancamento.iphone.apps.safari.Safari;
import lancamento.iphone.apps.telefone.Telefonar;
import lancamento.iphone.apps.telefone.Telefone;

public class Apple {
    public static void main(String[] args) {
        IPhone iPhone = new IPhone();
        TocadorMusica tocadorMusica = new TocadorMusica();
        Telefone telefone = new Telefonar();
        Safari safari = new Pagina();

        IPod iPod = tocadorMusica;


        iPod.selecionar();
        iPod.tocar();
        iPod.pausar();
        iPod.parar();
        telefone.ligar();
        telefone.atender();
        telefone.recusar();
        iPhone.ligar();
        iPhone.recusar();
        safari.abas();
        iPhone.navegar();
        safari.sincronizacao();
    }

}
