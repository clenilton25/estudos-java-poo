
package com.mycompany.aula12;


public class Ave extends Animal{
    private String corpena;
    
    public void fazerninho(){
        System.out.println("Fazendo ninho.....");
    }
    
    @Override
    public void locomover(){
        System.out.println("Voando ...");
    }
    
    @Override
    public void alimentar(){
        System.out.println("Comendo insetos e frutas!");
    }
    @Override
    public void emitirsom(){
        System.out.println("Som de ave .....");
    }
    
    public String getCorpena() {
        return corpena;
    }

    public void setCorpena(String corpena) {
        this.corpena = corpena;
    }
    
}
