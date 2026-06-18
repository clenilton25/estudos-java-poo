
package com.mycompany.aula12;


public class Reptil extends Animal{
    private String corescama;
    
    @Override
    public void alimentar(){
        System.out.println("comendo insetos....");
    }
    
    @Override
    public void locomover(){
        System.out.println("Ratejando .....");
    }
    
    @Override
    public void emitirsom(){
        System.out.println("Som de reptil....");
    }
    
    public String getCorescama() {
        return corescama;
    }

    public void setCorescama(String corescama) {
        this.corescama = corescama;
    }
    
    
    
}
