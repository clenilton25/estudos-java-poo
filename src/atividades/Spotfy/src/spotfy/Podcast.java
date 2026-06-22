
package spotfy;


public class Podcast extends Midia{
    private String host;
    private int numep;

    public Podcast(String titulo, float duracaoseg, String host, int numep) {
        super(titulo, duracaoseg);
        this.numep = numep;
        this.host = host;
    }
    
    @Override
    public void darPlay(){
        System.out.println("[ANUNCIO] COMPRE NOSSO PRODUTO !! :) ");
        System.out.println("");
        System.out.println("======== INICIOANDO O PODCAST... =========");
        System.out.println("");
        System.out.println("inicio ... " + this.getTitulo() + " episodio #" + this.numep + " Apresentado por .. " + this.host);
    }
    
}


