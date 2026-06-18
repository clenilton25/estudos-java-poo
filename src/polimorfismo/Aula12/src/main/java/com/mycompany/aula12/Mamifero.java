
package com.mycompany.aula12;


public class Mamifero extends Animal{
    private String corpelo;
    
    @Override
    public void locomover(){
        System.out.println("Correndo ....");
    }
    
    @Override
    public void alimentar(){
        System.out.println("Mamando...");
    }
    
    @Override
    public void emitirsom(){
        System.out.println("Som de mamifero ...");
    }
    public String getCorpelo() {
        return corpelo;
    }

    public void setCorpelo(String corpelo) {
        this.corpelo = corpelo;
    }
    
}
