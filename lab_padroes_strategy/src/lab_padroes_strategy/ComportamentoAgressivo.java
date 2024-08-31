package lab_padroes_strategy;

public class ComportamentoAgressivo implements Comportamento {

	@Override
	public void mover(int speed) {
		System.out.println("Movendo-se agressivamente com velocidade " + speed);
	}

}