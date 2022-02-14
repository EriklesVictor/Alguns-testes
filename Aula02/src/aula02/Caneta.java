package aula02;
public class Caneta {
    String  modelo;
    String cor;
    float ponta;
    int carga = 90;
    boolean tampada;
    void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Está tampada? " + this.tampada);
    }
    void rabiscar() {
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
    
    void tampar(){
        this.tampada = true;
    }
    void destampar() {
        this.tampada = false;
    }
}
