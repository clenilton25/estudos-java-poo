
package sistemarh;


public class Desenvolvedor extends Funcionario{
    
    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }
    
    @Override
    public double calcularBonus(){
        return (this.getSalario() *15)/100; 
    }
}
