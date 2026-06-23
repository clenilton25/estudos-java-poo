
package escoladolula;


public class EscoladoLula {

    
    public static void main(String[] args) {
        
        Turma t = new Turma("Java Poo");
        
        Aluno aluno1 = new Aluno("Gustavo", 4002, 7.5);
        Aluno aluno2 = new Aluno("Vitoria", 3231, 8.5);
        Aluno aluno3 = new Aluno("clenis", 1234, 10.0);
        
        t.adicionarAluno(aluno1);
        t.adicionarAluno(aluno2);
        t.adicionarAluno(aluno3);
        
        t.calcularMediaTurma();
    }
    
}