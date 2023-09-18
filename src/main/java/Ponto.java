public class Ponto {

    //atributos
    private double x;
    private double y;

    //construtor
    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    //métodos
    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public void setX(double x) {
        this.x = x;
    }
    
    public void setY(double y) {
        this.y = y;
    }

    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }
}
