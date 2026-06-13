
package aula02;
public class Canetas {
    //ATRIBUTOS
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    // METODOS
    void status(){
        System.out.printf("Modelo : %20s %n", this.modelo);
        System.out.printf("Uma caneta %19s %n", this.cor);
        System.out.printf("Esta tampada? %16b %n",this.tampada);
        System.out.printf("A espressura da ponta %8.1f %n", ponta);
        System.out.printf("Tem uma carga de %13d %n", carga);
    }
    
    void rabiscar(){
        if(this.tampada == true){
            System.out.println("ERRO! nao posso rabiscar!");
        } else {
            System.out.println("RABISCANDO...........");
        }
    }
    
    void tampar(){
        this.tampada = true; // significa que o c1 esta chamando!
    }
    
    void destampar(){
     this.tampada = false;
    }
}
