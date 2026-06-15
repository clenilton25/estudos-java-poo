
package aula05;


public class Aula05 {

    
    public static void main(String[] args) {
       ContaBanco p1 = new ContaBanco();
       
       p1.setnumConta(32313580);
       p1.setdono("creuza");
       p1.abrirConta("CC");
       
       ContaBanco p2 = new ContaBanco();
       
       p2.setnumConta(40028922);
       p2.setdono("joilson");
       p2.abrirConta("CP");
       p2.depositar(100);
       p1.depositar(500);
       p1.sacar(550);
       p1.fecharConta();
       
       
       
       p1.situacao();
       p2.situacao();
       
       
       
       
            
    }
    
}
