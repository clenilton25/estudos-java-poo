
package spotfy;


public class Midia {
    private String titulo;
    private float duracaoseg;

    public Midia(String titulo, float duracaoseg) {
        this.titulo = titulo;
        this.duracaoseg = duracaoseg;
    }
    public void darPlay(){
        System.out.println("Reproduzindo..... " + this.getTitulo());
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public float getDuracaoseg() {
        return duracaoseg;
    }

    public void setDuracaoseg(float duracaoseg) {
        this.duracaoseg = duracaoseg;
    }
    
    
}
