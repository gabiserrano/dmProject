package Habilidades.Azzan;

import Habilidades.Habilidad;
import Player.Players;
import java.util.List;

public class AzzanH2 implements Habilidad {

    @Override
    public void usarHabilidad(List<Players> players, Players currentPlayer) {
        for (Players opponent : players) {
            if (!opponent.equals(currentPlayer) && opponent.getEscudos() > 0) {
                opponent.setEscudos(opponent.getEscudos() - 1);
                currentPlayer.setEscudos(currentPlayer.getEscudos() + 1);
                break;

            }
        }
    }
}