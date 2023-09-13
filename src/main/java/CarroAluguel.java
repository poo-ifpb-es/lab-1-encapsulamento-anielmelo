public class CarroAluguel {
    //atributos
    private float debito;
    private float valorPorKm;
    private float distanciaPercorrida;
    private boolean statusDisponivel;
    private boolean statusSinistro;

    //construtor
    public CarroAluguel(float valorPorKm) {
        this.debito = 0;
        this.valorPorKm = valorPorKm;
        this.statusDisponivel = true;
        this.statusSinistro = false;
    }

    // métodos
    public float getValorPorKm() {
        return this.valorPorKm;
    }

    public void setValorPorKm(float valorPorKm) {
        this.valorPorKm = valorPorKm;
    }

    public float getDistanciaPercorrida() {
        return this.distanciaPercorrida;
    }

    public void setDistanciaPercorrida(int distancia) {
        this.distanciaPercorrida = distancia;
    }

    public void alugar() throws CarroIndisponivelException {
        if (this.isDisponivel() == false) {
            throw new CarroIndisponivelException("O carro está indisponível.");
        } else {
            this.statusDisponivel = false;
        }
    }

    public void devolver() throws CarroDisponivelException {
        if (this.isDisponivel() == true) {
            throw new CarroDisponivelException("O carro está disponível.");
        } else {
            this.verificaPagamento();
        }
    }

    private void verificaPagamento() throws CarroNaoPagoException {
        if (this.getDebito() > 0) {
            throw new CarroNaoPagoException("O carro não foi pago.");
        } else {
            this.statusDisponivel = true;
            this.debito = 0;
            this.distanciaPercorrida = 0;
            this.setSinistro(false);
        }
    }

    public boolean isDisponivel() {
        return this.statusDisponivel;
    }

    public boolean hasSinistro() {
        return this.statusSinistro;
    }

    public void setSinistro(boolean sinistro) {
        this.statusSinistro = sinistro;
    }

    public float getDebito() {
        if (this.getDistanciaPercorrida() > 0) {
            if (this.hasSinistro() == true) {
                this.debito = (float) ((this.getValorPorKm() * this.getDistanciaPercorrida()) + ((this.getValorPorKm() * this.getDistanciaPercorrida())*0.6));
            } else {
                this.debito = (this.getValorPorKm() * this.getDistanciaPercorrida());
            }
        }
        return this.debito;
    }

    public void pagar() throws CarroDisponivelException {
        if (this.isDisponivel() == false) {
            if (this.getDebito() > 0) {
                this.debito = 0;
                this.setSinistro(false);
                this.setDistanciaPercorrida(0);
            }
        } else {
            throw new CarroDisponivelException("O carro está disponível.");
        }
    }
}
