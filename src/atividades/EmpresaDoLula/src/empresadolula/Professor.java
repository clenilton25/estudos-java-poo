
package empresadolula;


public class Professor extends Funcionario{
    private int horasaulas;

    public Professor(String nome, double salariobase, int horasaulas) {
        super(nome, salariobase);
        this.horasaulas = horasaulas;
    }
    
    @Override
    public double calcularSalario(){
        double salariofinal = 0.0;
       salariofinal = this.getSalariobase() + (this.horasaulas *20);
       return salariofinal;
    }
    
    
}
