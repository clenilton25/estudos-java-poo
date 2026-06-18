
package aula11;


public class Tecnico extends Aluno{
    private int registroprof;
    public void praticar(){
        System.out.println("Mão na Massa! ");
    }

    public int getRegistroprof() {
        return registroprof;
    }

    public void setRegistroprof(int registroprof) {
        this.registroprof = registroprof;
    }
}
