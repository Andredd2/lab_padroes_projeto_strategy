package lab_padroes_strategy;

public class ComportamentoNormal implements Comportamento {
    @Override
    public void mover(int speed) {
        System.out.println("Movendo-se normalmente com velocidade " + speed);
    }
}
