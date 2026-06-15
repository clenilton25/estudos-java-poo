
package aula05;


public class ContaBanco {
        public int numConta;
        protected String tipo;
        private String dono;
        private float saldo;
        private boolean status;
    public ContaBanco(){
       this.setsaldo(0);
       this.setstatus(false);
    }

    public void abrirConta(String ac) {
        this.settipo(ac);
        this.setstatus(true);
        if (ac.equals("CC")){
            this.setsaldo(50);
        } else if(ac.equals("CP")) {
            this.setsaldo(150);
        }
        System.out.println("Conta aberta com sucesso ! ");
    }
    
    public void fecharConta(){
        if (this.getsaldo() > 0){
            System.out.println("conta com dinheiro!");
        } else if(this.getsaldo() < 0) {
            System.out.println("A conta ainda está em DÉBITO!");
        } else {
            this.setstatus(false);
            System.out.println("Conta fechada com sucesso ! ");
            
        }
    }
    
    public void depositar(float v){
        if (this.getstatus()) {
          //O VALOR IRÁ MUDAR DO SALDO QUE FOI PEGADO + o  V  
          this.setsaldo(this.getsaldo() + v);
            System.out.println("Deposito realizado na conta de  ! " + this.getdono());
        }else {
            System.out.println("ERRO!, IMPOSSIVEL DEPOSITAR!");
        }
    }
    
    public void sacar(float v){
        if (this.getstatus()){
            if(this.getsaldo() >= v) {
                this.setsaldo(this.getsaldo() - v);
                System.out.println("Saldo sacado na conta de " + this.getdono());
            }else {
                System.out.println("Saldo Insuficiente! " + this.getdono());
            }
        }
    }
    
    public void pagarMensal(){
        int v = 0;
        if(this.gettipo().equals("CC")){
            v = 12;
        } else if(this.gettipo().equals("CP")) {
            v = 20;
        }
        if(this.getstatus() == true) {
            if (this.getsaldo() > v){
                this.setsaldo(this.getsaldo() - v);
                System.out.println("Mensalidade paga com Sucesso de " + this.getdono());
            }else {
                System.out.println("Saldo insuficiente!");
            }
        }else {
            System.out.println("Impossivel Pagar!");
        }
    }
    
    public int getnumConta(){
        return this.numConta;
    }
    
    public void setnumConta(int nc){
        this.numConta = nc;
    }
    
    public String gettipo(){
        return this.tipo;
    }
    
    public void settipo(String t){
        this.tipo = t;
    }
    
    public String getdono(){
        return this.dono;
    }
    
    public void setdono(String d){
        this.dono = d;
    }
    
    public float getsaldo(){
        return this.saldo;
    }
    
    public void setsaldo(float s){
        this.saldo = s;
    }
    
    public boolean getstatus(){
        return this.status;
    }
    
    public void setstatus(boolean st){
        this.status = st;
    }
    
    public void situacao(){
        System.out.println("===================================================");
        System.out.println("Numero da conta : " + "   " + this.getnumConta());
        System.out.println("Tipo da conta : " + "     " + this.gettipo());
        System.out.println("Nome do dono : " + "      " + this.getdono());
        System.out.println("Saldo Atual : " + "       " + this.getsaldo());
        System.out.println("Conta : " + "             " + this.getstatus());
    }
    
    
    
    
}
