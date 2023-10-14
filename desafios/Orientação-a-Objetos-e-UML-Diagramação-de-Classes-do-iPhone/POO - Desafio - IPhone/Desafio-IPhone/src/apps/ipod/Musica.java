package apps.ipod;

public class Musica {
    //atributos
    private String descricao;

    public Musica(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return descricao;
    }
}
