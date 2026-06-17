
package aula07;

  
public class Lutador {
        //ATRIBUTOS
        private String nome;
        private String nascionalidade;
        private String categoria;
        private int vitoria, derrotas, empates;
        private int idade;
        private float altura;
        private float peso;
        
    
    
    public void apresentar(){
        System.out.println("====================================================================");
        System.out.println("A PRESENTAMOS O LUTADOR ! " + "           " + this.getNome());
        System.out.println("E ELE VEM DE  " + "  " + this.getNascionalidade());
        System.out.println("com " + this.getIdade() + " " + " Anos");
        System.out.println(this.getAltura() + "" + " m de Altura");
        System.out.println(" Pesando " + this.getPeso() + " " + " kg");
        System.out.println("ele tem " + "" + this.getVitoria() + " Vitorias " + this.getDerrotas() + " Derrotas " + " e " + this.getEmpates() + " Empates ");
    }
    
    public void status(){
        System.out.println(this.getNome() + " que é da categaria dos " + this.getCategoria());
        System.out.println("Com o peso de " + "      " + this.getPeso());
        System.out.println(this.getVitoria() + "     " + " Vitórias ");
        System.out.println(this.getDerrotas() + "    " + " Derrotas");
        System.out.println(this.getEmpates() + "     " + " Empates ");
    }
    
    public void ganharLuta(){
        this.setVitoria(this.getVitoria() + 1);
    }
    
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() + 1);
    }
    
    public void empatarLuta(){
        this.setEmpates(this.getEmpates() + 1);
    }

       //ATRIBUTOS ESPECIAIS 

    public Lutador(String no, String na, int vi, int de, int em, int id, float al, float pe) {
        this.nome = no;
        this.nascionalidade = na;
        this.vitoria = vi;
        this.derrotas = de;
        this.empates = em;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNascionalidade() {
        return nascionalidade;
    }

    public void setNascionalidade(String nascionalidade) {
        this.nascionalidade = nascionalidade;
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if(this.peso <= 52.2) {
            this.categoria = "Inválido";        
        } else if(this.peso <= 70.3) {
            this.categoria = "Leve";
        } else if(this.peso <= 83.9){
            this.categoria = "Médio";
        } else if(this.peso <= 120.2){
            this.categoria = "Pesado";
        } else {
            this.categoria = "Inválido";
        }
    } 

    public int getVitoria() {
        return vitoria;
    }

    public void setVitoria(int vitoria) {
        this.vitoria = vitoria;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }
    
    
        
        
}
