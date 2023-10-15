package lancamento.iphone.apps.ipod;

import java.util.ArrayList;
import java.util.List;

public class CatalogoMusicas {
    //atributos
    private List<Musica> musicaList;

    //metodo para adcionar musica, adciona uma lista vazia para adcionar elementos.
    public CatalogoMusicas() {
        this.musicaList = new ArrayList<>();
    }

    //metodo para remover musica
    public void adcionarMusica(String titulo) {
        musicaList.add(new Musica(titulo));
    }

    public void removerMusica(String titulo) {
        List<Musica> musicasParaRemover = new ArrayList<>();
        for (Musica m : musicaList) {
            if (m.getTitulo().equalsIgnoreCase(titulo)) {
                musicasParaRemover.add(m);
            }
        }
        musicaList.removeAll(musicasParaRemover);
    }

    public int obterNumeroTotalMusicas() {
        return musicaList.size();
    }

    public void obterTitulosMusicas() {
        if (musicaList.isEmpty()) {
            System.out.println("Sem Músicas!");
        } else {
            for (Musica musica : musicaList) {
                System.out.println(musica.getTitulo());
            }
        }
    }

    public static void main(String[] args) {

        CatalogoMusicas catalogoMusicas = new CatalogoMusicas();
        catalogoMusicas.adcionarMusica("I Want You Back");
        catalogoMusicas.adcionarMusica("London Calling");
        catalogoMusicas.adcionarMusica("Smells Like Teen Spirit");
        catalogoMusicas.adcionarMusica("Hey Jude");
        catalogoMusicas.adcionarMusica("What a Wonderful World");
        catalogoMusicas.obterTitulosMusicas();
    }
}
