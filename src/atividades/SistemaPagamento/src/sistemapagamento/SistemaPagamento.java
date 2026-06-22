
package sistemapagamento;


public class SistemaPagamento {

    
    public static void main(String[] args) {
        PagamentoCartao pc = new PagamentoCartao(150.00, 5);
        PagamentoPix pp = new PagamentoPix(150.00);
        
        System.out.println("O pagamento em Pix vai ser de " + pp.calcularValorFinal());
        System.out.println("O pagamento no cartão vai ser de  :" + pc.calcularValorFinal() );
    }
    
}
