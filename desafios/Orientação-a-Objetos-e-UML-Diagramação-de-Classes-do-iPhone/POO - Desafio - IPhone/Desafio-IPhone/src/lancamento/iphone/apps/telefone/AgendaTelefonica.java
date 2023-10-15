package lancamento.iphone.apps.telefone;

import java.util.ArrayList;
import java.util.List;

public class AgendaTelefonica {
    //atributos
private List<Contato> contatoList;

    public AgendaTelefonica() {this.contatoList = new ArrayList<>(); }



    public void adcionarContato(String nome, String sobrenome, String numeroTelefone, String organizacao) {
        contatoList.add(new Contato(nome,sobrenome, numeroTelefone, organizacao));
    }

    public List<Contato> pesquisarPorNome(String nome) {
        List<Contato> contatosPorNome = new ArrayList<>();
        if(!contatoList.isEmpty()){
            for (Contato c : contatoList) {
                if (c.getNome().equalsIgnoreCase(nome)) {
                    contatosPorNome.add(c);
                }
            }
        }
        return contatosPorNome;
    }

    public static void main(String[] args) {
        AgendaTelefonica contatos = new AgendaTelefonica();
        contatos.adcionarContato("Jony", "Ive","14089961011","Vice presidente da Apple");
        contatos.adcionarContato("Tim" , "Cook","14089961010","CEO da Apple" );

        List<Contato> contatosPorNome = contatos.pesquisarPorNome("Jony");

        System.out.println("Meus contatos por nome:");
        for (Contato contato : contatosPorNome) {
            System.out.println("Nome: " + contato.getNome());
            System.out.println("Sobrenome: " + contato.getSobrenome());
            System.out.println("Número de Telefone: " + contato.getNumeroTelefone());
            System.out.println("Organização: " + contato.getOrganizacao());
            System.out.println("----------");
        }
    }
}
