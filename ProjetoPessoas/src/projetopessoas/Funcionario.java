package projetopessoas;
public class Funcionario extends Pessoa{
    private String setor;
    private boolean trabalhando;
    
    //Métodos
    public void mudarTrabalho(){
        this.trabalhando = ! this.trabalhando;
    }
    
    //Métodos especiais

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
    
}
