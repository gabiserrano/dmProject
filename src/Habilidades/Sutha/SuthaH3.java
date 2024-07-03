package Habilidades.Sutha;

import Habilidades.Habilidad;
import Player.Players;
import java.util.List;

public class SuthaH3 implements Habilidad {

    @Override
    public void usarHabilidad(List<Players> players, Players currentPlayer) {
        int totalCuracion = 0;
        for (Players opponent : players) {
            if (!opponent.equals(currentPlayer)) {
                currentPlayer.curarse(1);
                opponent.recibirAtaque(1);
                totalCuracion++;
            }
        }
        System.out.println("Sutha se curó " + totalCuracion + " veces y atacó a cada oponente.");
    }
}
