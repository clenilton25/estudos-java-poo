
package sistemalogistica;


public class CarroCompacto extends Veiculo{
    private boolean arcondicionado;

    public CarroCompacto(String placa, double capatank, double combustivel, boolean arcondicionado) {
        super(placa, capatank, combustivel);
        this.arcondicionado = arcondicionado;
    }

    @Override
    public double calcularConsumoKmLitros() {
        return this.arcondicionado ? 10.0 : 12.0;
    }
}
