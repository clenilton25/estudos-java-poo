
package sistemapagamento;


public class PagamentoCartao extends Pagamento{
    private int parcelas;

    public PagamentoCartao(double valororigin, int parcelas) {
        super(valororigin);
        this.parcelas = parcelas;
    }
    
    @Override
    public double calcularValorFinal(){  
    double taxa = this.getValororigin();
    if(this.parcelas > 3){
    taxa += 20.00;
    
    }
    return taxa;
    }
}
