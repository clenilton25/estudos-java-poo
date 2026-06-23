
package empresadolula;


public class EmpresaDoLula {

   
    public static void main(String[] args) {
        Professor p1 = new Professor("gustavo", 5000.00, 10);
        System.out.println("O SALARIO TOTAL DO PROFESSOR E : " + p1.calcularSalario());
    }
    
}
