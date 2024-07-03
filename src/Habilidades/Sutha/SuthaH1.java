package Habilidades.Sutha;

import Habilidades.Habilidad;
import Player.Players;
import java.util.List;

public class SuthaH1 implements Habilidad {

    @Override
    public void usarHabilidad(List<Players> players, Players currentPlayer) {
        for (Players opponent : players) {
            if (!opponent.equals(currentPlayer) && opponent.getEscudos() > 0) {
                opponent.setEscudos(opponent.getEscudos() - 1);
                System.out.println("Sutha destruyó una carta de escudo de " + opponent.getName() + ".");
                break;
            }
        }
    }
}
