
package sistemapagamento;


public class PagamentoPix extends Pagamento{

    public PagamentoPix(double valororigin) {
        super(valororigin);
    }
    
    public double calcularValorFinal(){
    double calc;
        calc = this.getValororigin() - (this.getValororigin() *10) / 100;
    return calc;
    }
}
