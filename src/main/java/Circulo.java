public class Circulo {

    //atributos
    private float PI = (float) 3.14159;
    private float raio;

    //construtor
    public Circulo(float raio) {
        this.raio = raio;
    }
    
    //métodos
    public float getRaio() {
        return this.raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }

    public float getArea() {
        return this.PI*(this.raio*this.raio);
    }

    public float getCircunferencia() {
        return 2*this.PI*this.raio;
    }
}
