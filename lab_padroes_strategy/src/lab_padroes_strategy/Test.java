package lab_padroes_strategy;

import lab_padroes_strategy.Comportamento;
import lab_padroes_strategy.ComportamentoAgressivo;
import lab_padroes_strategy.ComportamentoDefensivo;
import lab_padroes_strategy.ComportamentoNormal;
import lab_padroes_strategy.Robo;


public class Test {

    public static void main(String[] args) {

        // Strategy
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover(5);
        robo.mover(5);
        robo.setComportamento(defensivo);
        robo.mover(2);
        robo.setComportamento(agressivo);
        robo.mover(10);
        robo.mover(10);
        robo.mover(10);
    }
}