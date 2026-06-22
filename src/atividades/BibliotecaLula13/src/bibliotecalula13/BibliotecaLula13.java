
package bibliotecalula13;


public class BibliotecaLula13 {

    
    public static void main(String[] args) {
        Livro l[] = new Livro[3];
        
        l[0] = new Livro("AQUELE MENINO QUE BRINCAVA", "ZE DA MANGA", 50);
        
        l[0].lerPag(100);
        l[0].situacao();
        
    }
    
}
