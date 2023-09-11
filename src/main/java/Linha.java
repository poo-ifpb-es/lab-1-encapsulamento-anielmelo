public class Linha {
    //atributos
    private Ponto inicio;
    private Ponto fim;

    //construtor
    public Linha(Ponto inicio, Ponto fim) {
        this.inicio = inicio;
        this.fim = fim;
    }

    //métodos
    public Ponto getInicio() {
        return this.inicio;
    }

    public void setInicio(Ponto inicio) {
        this.inicio = inicio;
    }

    public Ponto getFim() {
        return this.fim;
    }

    public void setFim(Ponto fim) {
        this.fim = fim;
    }

    public double getComprimento() {
        return Math.sqrt(Math.pow((fim.getX() - inicio.getX()), 2) + Math.pow((fim.getY() - inicio.getY()), 2));
    }
}
