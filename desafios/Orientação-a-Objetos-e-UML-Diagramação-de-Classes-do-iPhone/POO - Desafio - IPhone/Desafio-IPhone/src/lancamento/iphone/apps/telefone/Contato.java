package lancamento.iphone.apps.telefone;

public class Contato {
    //atributos
    private String nome;
    private String sobrenome;
    private String numeroTelefone;
    private String organizacao;

    public Contato(String nome, String sobrenome, String numeroTelefone, String organizacao) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.numeroTelefone = numeroTelefone;
        this.organizacao = organizacao;
       }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getNumeroTelefone() {
        return numeroTelefone;
    }

    public String getOrganizacao() {
        return organizacao;
    }


    @Override
    public String toString() {
        return "Contato{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", numeroTelefone=" + numeroTelefone +
                ", organizacao='" + organizacao + '\'' +
                '}';
    }
}
