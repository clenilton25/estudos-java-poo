
package sistemarh;


public class Gerente extends Funcionario{
    private double bonusfixo;

    public Gerente(String nome, double salario, double bonusfixo){
        super(nome, salario);
        this.bonusfixo = bonusfixo;
        
    }
    
    public double calcularBonus(){
        double calc;
        calc = super.calcularBonus() + this.bonusfixo;
        return calc;
    }
    
    
}
