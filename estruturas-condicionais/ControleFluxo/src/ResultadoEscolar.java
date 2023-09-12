public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 5;
       
       if(nota >= 7)
        System.out.println("Aluno Aprovado");

       else if(nota >= 5 && nota < 7)
        System.out.println("Aluno em Recuperação");

       else
        System.out.println("Aluno Reprovado");
    }
}
