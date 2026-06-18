
package aula13;

/**
 *
 * @author clenilton
 */
public class Aula13 {

    public static void main(String[] args) {
      Cachorro ca = new Cachorro();
      
      ca.reagir("cheguei");
      ca.reagir("vou te dar um banho");
        System.out.println("");
      ca.reagir(11, 45);
      ca.reagir(21, 00);
        System.out.println("");
      ca.reagir(true);
      ca.reagir(false);
        System.out.println("");
      ca.reagir(2, 12.5f);
      ca.reagir(17, 4.5f);
      
    }
}