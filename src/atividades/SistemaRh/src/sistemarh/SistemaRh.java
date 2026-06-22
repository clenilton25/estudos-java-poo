
package sistemarh;

public class SistemaRh {

    
    public static void main(String[] args) {
        Gerente g1 = new Gerente("Guilherme", 5000.0, 1000.0);
        
        System.out.println("Bonus do " + g1.getNome() + ": R$ " + g1.calcularBonus());
    }
    
}
