
package com.mycompany.aula12;


public class Peixe extends Animal{
    private String corescama;
    
    public void soltarbolha(){
        System.out.println("Soltando bolhas! ...");
    }
    
    @Override
    public void locomover(){
        System.out.println("Nadando ....");
    }
    
    @Override
    public void alimentar(){
        System.out.println("comendo algas .....");
    }
    
    @Override
    public void emitirsom(){
        System.out.println("Som de peixe....");
    }
    
    public String getCorescama() {
        return corescama;
    }

    public void setCorescama(String corescama) {
        this.corescama = corescama;
    }
    
}
