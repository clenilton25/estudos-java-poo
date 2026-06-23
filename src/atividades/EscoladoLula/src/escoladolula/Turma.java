
package escoladolula;


public class Turma {
    private String disciplina;
    private Aluno listaAlunos[] = new Aluno[3];
    private int contaluno;

    public Turma(String disciplina) {
        this.disciplina = disciplina;
        this.listaAlunos = new Aluno[3];
        this.contaluno = 0;
    }
    
    public void adicionarAluno(Aluno novoAluno){
        if(this.contaluno < 3){
        this.listaAlunos[this.contaluno] = novoAluno;
        this.contaluno++;
            System.out.println(novoAluno.getNome() + " foi adicionado com sucesso!!");
        }else {
            System.out.println("ERRO! a turma ja está lotada!á");
        }   
    }
    
    public void calcularMediaTurma(){
        if(this.contaluno == 0) {
            System.out.println("Nao e possvel calcular a média é: nemhum aluno cadastrado!");
            return;
        }
        
        double somaNotas = 0.0;
        
        for(int i = 0; i < this.contaluno; i++){
            somaNotas += this.listaAlunos[i].getNota();
        }
        double media = somaNotas / this.contaluno;
        System.out.println("A media da Turma de " + this.disciplina + " é : " + media);
    }
    
    
}
