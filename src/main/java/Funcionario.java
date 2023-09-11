public class Funcionario {
    
    //atributos
    private String nome;
    private String sobrenome;
    private float salario;

    //construtor
    public Funcionario(String nome, String sobrenome, float salario) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salario = salario;
    }

    //métodos
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return this.sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public float getSalario() {
        return this.salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float getSalarioAnual() {
        return this.salario*12;
    }

    public void concederAumento(float valor) {
        if (valor >= 0 && valor <= 100) {
            this.salario += this.salario*(valor/100);
        }
    }
}
