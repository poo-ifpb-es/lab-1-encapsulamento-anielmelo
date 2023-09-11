public class Estudante {

    //atributos
    private int matricula;
    private String nome;

    //construtor
    public Estudante(String nome, int matricula) {
        this.matricula = matricula;
        this.nome = nome;
    }
    
    //métodos
    public int getMatricula() {
        return this.matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
}
