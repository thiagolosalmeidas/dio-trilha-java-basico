package lancamento.iphone.apps.ipod;

public class Musica {
    //atributos
    private String titulo;
    private String artista;
    private String album;
    private double duracao;
    private int ano;

    public Musica(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    @Override
    public String toString() {
        return this.titulo;
    }
}
