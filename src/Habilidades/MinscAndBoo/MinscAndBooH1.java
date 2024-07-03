package Habilidades.MinscAndBoo;

import Habilidades.Habilidad;
import Player.Players;
import java.util.List;

public class MinscAndBooH1 implements Habilidad {

    @Override
    public void usarHabilidad(List<Players> players, Players currentPlayer) {
        for (Players opponent : players) {
            if (!opponent.equals(currentPlayer) && !opponent.getMazo().isEmpty()) {
                currentPlayer.getMano().add(opponent.getMazo().remove(0));
            }
        }
        System.out.println("Minsc and Boo robaron una carta del mazo de cada oponente.");
    }
}
