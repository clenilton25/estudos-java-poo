
package aula04;


public class Caneta {
        public String modelo;
        public String cor;
        private float ponta;
        private boolean tampada;
        private boolean destampada;
        
        public Caneta(String m, String c, float p){  // METODO CONSTRUTOR
            this.modelo = m;
            this.cor = c;
            this.ponta = p;
            this.tampada();
             
        }
        
        public String getModelo(){
            return this.modelo;
        }
        
        public void setModelo(String m){
            this.modelo = m;
        }
        public float getPonta(){
            return this.ponta;
        }
        
        public void setPonta(float p){
            this.ponta = p; 
        }
        
        public void tampada(){
            this.tampada = true;
        }
        
        public void destampada(){
            this.destampada = false;
        }
        
        public void status(){
            System.out.println("SOBRE A CANETA!");
            System.out.println("");
            System.out.println("O modelo da caneta :" + "         " + this.getModelo());
            System.out.println("A ponta da caneta :" + "          " + this.getPonta());
            System.out.println("Cor " + "                         " + this.cor);
            System.out.println("Tampada : " + "                   " + this.tampada);
            
        }
}
