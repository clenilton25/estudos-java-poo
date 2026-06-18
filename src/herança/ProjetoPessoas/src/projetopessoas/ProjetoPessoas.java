
package projetopessoas;


public class ProjetoPessoas {

    
    public static void main(String[] args) {
        Pessoa p0 = new Pessoa();
        Aluno p1 = new Aluno();
        Professor p2 = new Professor();
        Funcionario p3 = new Funcionario();
        
        p0.setNome("viviane");
        p1.setNome("felipe");
        p2.setNome("Lula");
        p3.setNome("ze chibata");
        
        p0.setSexo("F");
        p1.setSexo("M");
        p2.setSexo("M");
        p3.setSexo("M"); 
        
        p2.setIdade(27);
        
        p1.setCurso("Analise e desenvolvimento de sistemas");
        p2.setSal(2.500f);
        p3.setSetor("Escravo");
        
      //  p1.setSal(2.500f); // pode ver que este codigo da erro por que somente
                            // a classe de professor tem esse metodo porem todos
                            // eles podem herdar da mãe nao a mae dos filhos!
        
        System.out.println(p0.toString());
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        
        
    }
    
}
