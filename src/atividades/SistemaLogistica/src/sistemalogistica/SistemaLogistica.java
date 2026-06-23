
package sistemalogistica;

import java.util.ArrayList;
import java.util.List;


public class SistemaLogistica {

    
    public static void main(String[] args) {
        
        List<Veiculo> frota = new ArrayList<>();
        
        
        frota.add(new Caminhao("ABC-1234", 300.0, 0.0, 10.0));
        
        
        frota.add(new CarroCompacto("XYZ-9876", 50.0, 0.0, true));
        
        System.out.println("---  ABASTECENDO A FROTA ---");
        
        for (Veiculo v : frota) {
            System.out.println("\nVeículo Placa: " + v.getPlaca());
            v.abastecer(100.0); 
        }
        
        System.out.println("\n ==== INICIANDO VIAGEM DE 100 KM ====");
        
        for (Veiculo v : frota) {
            System.out.println("\nVeículo Placa: " + v.getPlaca());
            v.viajar(100.0);
            System.out.println("Combustível restante: " + v.getCombustivel() + " Litros");
        }
    }
    
}
