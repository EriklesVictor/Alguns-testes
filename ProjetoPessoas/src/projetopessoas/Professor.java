package projetopessoas;
public class Professor extends Pessoa {
    private String especilidade;
    private float salario;
    
    //Métodos
    public void ReceberAum(float aum){
        this.salario += aum;
    }
    //Métodos Especiais

    public String getEspecilidade() {
        return especilidade;
    }

    public void setEspecilidade(String especilidade) {
        this.especilidade = especilidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    
}
