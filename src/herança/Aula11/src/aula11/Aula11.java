
package aula11;


public class Aula11 {

    
    public static void main(String[] args) {
       // Pessoa p1 = new Pessoa(); //PODE-SE VER QUE DEPOIS DESTE CHAMADO DA PROBLEMA
                                 // POR QUE A CLASSE ESTA ABSTRACT OU SEJA ELA NAO 
                                 // GERA OBJETOS!.
                                 
        Visitante v1 = new Visitante();
        Aluno a1 = new Aluno();
        Bolsista b1 = new Bolsista();
        //mostrar a herança que visitante recebeu! 
        v1.setNome("ZE COMEIA");
        v1.setIdade(31);
        v1.setSexo("masculino");
        v1.status();
        
        
        a1.setNome("bebel");
        a1.setMatricula(4002);
        a1.setIdade(24);
        a1.setCurso("Baitolagem");
        a1.setSexo("androgino");
        
        a1.status();
        System.out.println("");
        a1.pagarMes(); 
        
        b1.setNome("Bolsonaro");
        b1.setMatricula(3231);
        b1.setIdade(15);
        b1.setCurso("saco de pancada do governo");
        b1.setSexo("descobrindo..");
        b1.setBolsa(50.0f);
        
        b1.status();
        System.out.println("");
        b1.renovarBolsa();
        b1.pagarMes();
        
        Professor pr1 = new Professor();
        
        pr1.setNome("jubileu");
        pr1.setIdade(52);
        pr1.setSexo("cabra macho");
        pr1.setEspecialidade("isame de prostota");
        pr1.setSalario(5.000f);
        pr1.status();
        System.out.println("");
        pr1.receberAum();
        
        Tecnico t1 = new Tecnico();
        
        t1.setNome("joilson");
        t1.setIdade(24);
        t1.setRegistroprof(32313580);
        t1.setSexo("mulher alternativa");
        t1.setMatricula(3235);
        t1.setCurso("eletrcista");
        t1.status();
        System.out.println("");
        t1.praticar();
        
        
        
    }
    
}
