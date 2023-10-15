package lancamento.iphone;

import lancamento.iphone.apps.ipod.IPod;
import lancamento.iphone.apps.safari.Safari;
import lancamento.iphone.apps.telefone.Telefone;

public class IPhone implements IPod, Telefone, Safari {
    @Override
    public void tocar() {

    }

    @Override
    public void pausar() {

    }

    @Override
    public void parar() {
    }

    @Override
    public void selecionar() {

    }

    @Override
    public void adicionar() {

    }

    @Override
    public void reproduzirLista() {

    }

    @Override
    public void ligar() {
        System.out.println("Iniciar correio de voz");

    }

    @Override
    public void atender() {

    }

    @Override
    public void recusar() {
        System.out.println("Recusar Mensagem do Correio de Voz");
    }

    @Override
    public void navegar() {
        System.out.println("Adcionar Nova Aba");
    }

    @Override
    public void abas() {

    }

    @Override
    public void sincronizacao() {

    }

    @Override
    public void zoom() {

    }

    @Override
    public void traducao() {

    }

    @Override
    public void recursosAcessibilidade() {

    }
}
