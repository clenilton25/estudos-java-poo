
package bancodolula;


public class ContaBanco {
    private int numconta;
    private String titular;
    private double saldo;
    private boolean conta;

    public ContaBanco(int numconta, String titular) {
        this.numconta = numconta;
        this.titular = titular;
        this.saldo = 0.0;
        this.conta = true;
    }
    
    public void depositar(double deposito){
       if(deposito > 0) {
           this.saldo += deposito;
       }else {
           System.out.println("ERRO! Deposito inválido !!");
       }
    }
    
    public void sacar(double saque){
        if(saque <= 0) {
            System.out.println("ERRO!! Valor insuficiente !");  
        } else if(this.saldo >= saque) {
           this.saldo = this.saldo - saque;
            System.out.println("saque de " + saque + " Realizado com sucesso !!");
        }else {
            System.out.println("ERRO! saldo insuficiente para realizar o saque !");
        }
    }
    
    public void extrato(){
        System.out.println("Numero da conta : " + "    " + this.getNumconta());
        System.out.println("Nome do Titular : " + "    " + this.getTitular());
        System.out.println("Saldo Atual : " + "        " + this.getSaldo());
        System.out.println("Conta ativa ?" + "         " + this.getConta());
        
    }

    public int getNumconta() {
        return numconta;
    }

    public void setNumconta(int numconta) {
        this.numconta = numconta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean getConta() {
        return conta;
    }

    public void setConta(boolean conta) {
        this.conta = conta;
    }
    
    
    
}
