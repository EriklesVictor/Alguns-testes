package aula11;
public class Aula11 {
    public static void main(String[] args) {
        Visitante v1 = new Visitante();
        v1.setNome("Pedro");
        v1.setIdade(25);
        v1.setSexo("M");
        //System.out.println(v1.toString());
        
        Aluno al = new Aluno();
        al.setNome("João");
        al.setMatricula(1111);
        al.setCurso("Informática");
        al.setIdade(25);
        al.setSexo("M");
        al.pagarMensal();
        Bolsista b1 = new Bolsista();
        b1.setMatricula(1112);
        b1.setNome("Jubis");
        b1.setBolsa(12.5f);
        b1.setSexo("M");
        b1.pagarMensal();
    }
    
}
