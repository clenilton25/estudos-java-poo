
package aula04;


public class Aula04 {

   
    public static void main(String[] args) {
        Caneta c1 = new Caneta("Bic", "Verde", 0.5f);
        
        c1.status();
        
        Caneta c2 = new Caneta("cute", "rosa", 1.5f);
        
        c2.status();
        
        /*c1.setModelo("BIC"); //USANDO UM METODO ACESSOR.
        c1.modelo = "BIC"; // ACESSANDO DIRETAMENTE PELO ATRIBUTO.
        
        
        c1.setPonta(0.5f);// MAS ATRAVES DE UM ACESSOR EU POSSO MUDAR SEM TER
                          // QUE ACESSAR AO METODO DEIXANDO ELE SEGURO!
        
        //c1.ponta = 0.7f; //PODE-SE VER QUE NAO CONSIGO ACESSAR AO METODO CANETA
        //c1.status();     //DIRETAMENTE POR QUE ELE TEM O METODO PRIVADO 
        
        System.out.println("Tenho uma caneta " + c1.getModelo() + " de ponta " + c1.getPonta());
        */
    }
    
}
