
package biblioteca;


public class Biblioteca {

    
    public static void main(String[] args) {
        Pessoa p[] = new Pessoa[2];
        Livro l[] = new Livro[2];
        
        p[0] = new Pessoa("OSWALDO", "MASCULINO", 31);
        
        l[0] = new Livro("NAS MEMORIAS", "ZE FULEIRO", 100, 21, true, p[0]);
        
        l[0].abrir();
        l[0].avancarpag();
        l[0].folhear(5);
        l[0].detalhes();
    }
    
}
