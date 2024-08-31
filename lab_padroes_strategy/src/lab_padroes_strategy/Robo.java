package lab_padroes_strategy;

public class Robo {

    private Comportamento comportamento;

    public void setComportamento(Comportamento comportamento) {
        this.comportamento = comportamento;
    }

    public void mover(int speed) {
        comportamento.mover(speed);
    }
}
