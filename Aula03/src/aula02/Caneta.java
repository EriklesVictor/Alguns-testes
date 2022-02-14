package aula02;
public class Caneta {
    public String  modelo;
    public String cor;
    private float ponta;
    protected int carga = 90;
    private boolean tampada;
    public void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Está tampada? " + this.tampada);
    }
    public void rabiscar() {
        if (this.tampada == true){
            System.out.println("Tire a tampa");
        } else {
            System.out.println("Estou sem tampa!");
        }
        if (this.carga == 0) {
            System.out.println("Estou sem carga! me carregue");
        } else {
            System.out.println("Estou com carga");
        }
    }
    
    public void tampar(){
        this.tampada = true;
    }
    public void destampar() {
        this.tampada = false;
    }
}
