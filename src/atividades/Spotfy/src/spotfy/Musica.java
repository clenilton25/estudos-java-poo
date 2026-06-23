
package spotfy;




public class Musica extends Midia{
    private String artista;
    private int visu;

    public Musica(String titulo, float duracaoseg, String artista) {
        super(titulo, duracaoseg);
        this.artista = artista;
        this.visu = 0;
    }
    
    @Override
    public void darPlay(){
        this.visu++;
        System.out.println("Tocando.. " + this.getTitulo() + " " + this.artista + " \n total de vizualizações :" + this.visu);
    }
    
}
