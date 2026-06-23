
package sistemalogistica;


public class Caminhao extends Veiculo{
    private double pesocarga;
    
    public Caminhao(String placa, double capatank, double combustivel, double pesocarga){
        super(placa, capatank, combustivel);
        this.pesocarga = pesocarga;
    }

    @Override
    public double calcularConsumoKmLitros() {
        double perdaporcarga = this.pesocarga *0.2;
        double consumo = 6.0 - perdaporcarga;
        
        if(consumo < 1.0){
            return 1.0;
        }
        return consumo;
    }
}
