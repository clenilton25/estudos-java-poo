
package bibliotecalula13;


public class Livro implements AcaoLer{
    private String titulo;
    private String autor;
    private int pagatual;
    private int totpag;
    private int paglidas;
    private float progress;

    public Livro(String titulo, String autor, int totpag) {
        this.titulo = titulo;
        this.autor = autor;
        this.totpag = totpag;
        
    }

    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotpag() {
        return totpag;
    }

    public void setTotpag(int totpag) {
        this.totpag = totpag;
    }

    public int getPaglidas() {
        return pagatual;
    }

    public void setPaglidas(int paglidas) {
       paglidas = this.getPagatual();
    }

    public int getPagatual() {
        return pagatual;
    }

    public void setPagatual(int pagatual) {
        this.pagatual = pagatual;
    }

    public float getProgress() {
        progress = this.pagatual *100 /this.totpag; 
        return progress;
    }

    @Override
    public void pularPag() {
        if(this.pagatual < this.totpag){
        this.pagatual ++;
        this.paglidas ++;
        }else {
            System.out.println("Você ja terminou o Livro!");
        }
    }

    @Override
    public void voltarPag(){
        if(this.pagatual > 0){
        this.pagatual --;
        this.paglidas --;
        }else {
            System.out.println("Você ja esta na Primeira Pagina!!");
        }
    }

    @Override
    public void lerPag(int pag){
        if(pag <= this.totpag && pag > 0){
        this.setPagatual(pag);
        }else {
            System.out.println("====== Valor de Pagina inválido!!! ======");
        }
    }

    @Override
    public void situacao(){
        System.out.println("Titulo do Livro : " + "              " + this.getTitulo());
        System.out.println("Autor do Livro : " + "               " + this.getAutor());
        System.out.println("Total de Paginas do Livro : " + "    " + this.getTotpag());
        System.out.println("Paginas que ja foram Lidas : " + "   " + this.getPaglidas());
        System.out.println("Pagina Atual : " + "                 " + this.getPagatual());
        System.out.println("progresso : " + "        Você ja leu " + this.getProgress() + " %  do Livro !");
    }
    
    
}
