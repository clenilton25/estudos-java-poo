
package aula02;


public class Aula02 {
    
    public static void main(String[] args) {
        Canetas c1 = new Canetas();
        
        //ATRIBUIÇAO
        c1.cor = "AZUL";
        c1.carga = 90;
        c1.modelo = "BIC";
        c1.ponta = 0.5f;
        
        c1.tampar();
        c1.rabiscar();
        //CHAMADA
        c1.status();
        System.out.println("");
        Canetas c2 = new Canetas();
        c2.cor = "PRETO";
        c2.carga = 0;
        c2.modelo = "COMPACTO";
        c2.ponta = 1.0f;
        
        c2.destampar();
        c2.rabiscar();
        c2.status();
       
    }
    
}
