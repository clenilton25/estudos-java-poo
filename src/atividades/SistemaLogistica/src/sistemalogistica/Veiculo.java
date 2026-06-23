
package sistemalogistica;


public abstract class Veiculo {
    private String placa;
    private double capatank;
    private double combustivel;

    public Veiculo(String placa, double capatank, double combustivel) {
        this.placa = placa;
        this.capatank = capatank;
        this.combustivel = combustivel;
    }
    
    public abstract double calcularConsumoKmLitros();
    
    public void viajar(double distanciakm){
      double consumo = calcularConsumoKmLitros();
      double litrosnescessario = distanciakm / consumo;
      if (this.combustivel >= litrosnescessario){
          this.combustivel -= litrosnescessario;
          System.out.println("Viagem de " + distanciakm + " Km realizada com sucesso!");
      }
    }
   
    public void abastecer(double litros){
        if(litros < 0){
            System.out.println("Erro!! Abastecimnto invalido!");
        }else if(this.combustivel + litros > this.capatank){
        double sobra = (this.combustivel + litros) - this.capatank;
        this.combustivel = this.capatank;
            System.out.println("Voce ja encheu o tanque e sobrou " + sobra + " Litros !");
        }else {
            this.combustivel += litros;
            System.out.println("abastecimento com sucesso! combustivel atual : " + this.combustivel);
        }
        
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getCapatank() {
        return capatank;
    }

    public void setCapatank(double capatank) {
        this.capatank = capatank;
    }

    public double getCombustivel() {
        return combustivel;
    }   
}
