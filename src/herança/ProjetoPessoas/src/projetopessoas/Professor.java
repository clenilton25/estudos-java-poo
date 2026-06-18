
package projetopessoas;


public class Professor extends Pessoa{
    private String especi;
    private float sal;
    
    public void aumentosal(float aumento){
        this.sal += aumento;
    }

    public String getEspeci() {
        return especi;
    }

    public void setEspeci(String especi) {
        this.especi = especi;
    }

    public float getSal() {
        return sal;
    }

    public void setSal(float sal) {
        this.sal = sal;
    }
    
}
