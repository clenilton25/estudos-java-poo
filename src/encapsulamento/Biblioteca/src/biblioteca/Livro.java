
package biblioteca;


public class Livro implements Publicacao{
        private String titulo;
        private String autor;
        private int totpaginas;
        private int pagatual;
        private boolean aberto;
        private Pessoa leitor;

    public Livro(String titulo, String autor, int totpaginas, int pagatual, boolean aberto, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totpaginas = totpaginas;
        this.pagatual = 0;
        this.aberto = false;
        this.leitor = leitor;
    }
    
    public void detalhes(){
        System.out.println("============ INFORMÇOES DO LEITOR =============");
        System.out.println("");
        System.out.println("Nome do Leitor : " + "     " + this.leitor.getNome());
        System.out.println("Genero do Leitor : " + "   " + this.leitor.getSexo());
        System.out.println("Idade do leito : " + "     " + this.leitor.getIdade() );
        System.out.println("========================================================");
        System.out.println("");
        System.out.println("============ INFORMAÇOES DO LIVRO ==================");
        System.out.println("Livro " + "                " + this.getTitulo());
        System.out.println("Autor do Livro : " + "     " + this.getAutor());
        System.out.println("O total de Paginas :" + "  " + this.getTotpaginas());
        System.out.println("Você esta na pagina : " + "" + this.getPagatual());
        System.out.println("Situaçao do Livro : " + "  " + this.getAberto());
        System.out.println("quem está lendo é " + "    " + this.getLeitor().getNome());
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

    public int getTotpaginas() {
        return totpaginas;
    }

    public void setTotpaginas(int totpaginas) {
        this.totpaginas = totpaginas;
    }

    public int getPagatual() {
        return pagatual;
    }

    public void setPagatual(int pagatual) {
        this.pagatual = pagatual;
    }

    public boolean getAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
        this.aberto = true;
    }

    @Override
    public void fechar() { 
        this.aberto = false;
    }

    @Override
    public void avancarpag() {
        this.pagatual++;
    }

    @Override
    public void voltarpag() {
        this.pagatual--;
    }

    @Override
    public void folhear(int p) {
        if(p > this.totpaginas) {
            this.pagatual = 0;
        } else{
            this.pagatual = p;
        }
        
    }

    
    
    
    
        
        
}
