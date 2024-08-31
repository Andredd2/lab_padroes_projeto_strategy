package lab_padroes_strategy;

public class ComportamentoDefensivo implements Comportamento {
    @Override
    public void mover(int speed) {
        System.out.println("Movendo-se defensivamente com velocidade " + speed);
    }
}
