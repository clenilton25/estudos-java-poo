
package bancodolula;


public class BancodoLula {

    
    public static void main(String[] args) {
        ContaBanco conta[] = new ContaBanco[3];
        
        conta[0] = new ContaBanco(4002, "Rodrigo Gengiva" );
        
        
        conta[0].depositar(0.00);
        
        conta[0].extrato();
                
    }
    
}
