package projetoyoutube;
public class ProjetoYoutube {
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 2 de PHP");
        v[2] = new Video("Aula 3 de HTML5");
        
        System.out.println(v[0].toString());
    }
    
}
