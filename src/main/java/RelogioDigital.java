public class RelogioDigital {
    //atributos
    private int hora;
    private int minuto;

    //construtor
    public RelogioDigital() {
        this.hora = 12;
        this.minuto = 20;
    }

    //métodos
    public int getHora() {
        return this.hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return this.minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public void tick() {
        this.minuto ++;

        if (this.minuto > 59) {
            this.minuto = 0;
            this.hora ++;
        }

        if (this.hora > 23) {
            this.hora = 0;
        }
    }
}
