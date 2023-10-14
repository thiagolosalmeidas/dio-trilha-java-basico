package apps.ipod;

import java.util.ArrayList;
import java.util.List;

public class ListaMusica {
    //atributos
    private List<Musica> musicaList;
    //metodo para adcionar musica, adciona uma lista vazia para adcionar elementos.
    public ListaMusica() {
        this.musicaList = new ArrayList<>();
    }
    //metodo para remover musica
    public void adcionarMusica(String descricao) {
        musicaList.add(new Musica(descricao));
    }

    public void removerMusica(String descricao) {
        List<Musica> musicasParaRemover = new ArrayList<>();
        for (Musica m : musicaList) {
            if(m.getDescricao().equalsIgnoreCase(descricao)) {
                musicasParaRemover.add(m);
            }
        }
        musicaList.removeAll(musicasParaRemover);
    }
    public int obterNumeroTotalMusicas(){
        return musicaList.size();
    }
    public void obterDescricoesMusicas() {
        System.out.println(musicaList);
    }



    public static void main(String[] args) {

    ListaMusica listaMusica = new ListaMusica();
        listaMusica.adcionarMusica( "Sargent Peppers");
        listaMusica.adcionarMusica( "Shuflle");
        listaMusica.adcionarMusica( "Fixin A Hole");
        listaMusica.adcionarMusica( "Like a Rolling Stone");


        listaMusica.obterDescricoesMusicas();

    }

}
