
package spotfy;


public class Spotfy {

    
    public static void main(String[] args) {
        Midia fila[] = new Midia[2];
        
        fila[0] = new Musica("granade", 3.50f, "Bruno Mars");
        fila[1] = new Podcast("Devs javapoo", 60.30f, "guanabara", 42 );
        
        for(int i = 0; i < fila.length; i++){
            fila[i].darPlay();
            System.out.println("=========================================");
        }
    }
    
}
