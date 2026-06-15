
package aula02;


public class Aula02 {
    
    public static void main(String[] args) {
        Canetas c1 = new Canetas();
        c1.modelo = "BIC CRISTAL";
        c1.cor = "AZUL";
        //c1.ponta = 0.5f;    NAO POSSO USAR POR CAUSA QUE ESTA private!
        c1.carga = 80; 
        //c1.tampada = false;
        c1.tampar();
        c1.status();
        c1.rabiscar();
       
    }
    
}
