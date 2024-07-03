package Habilidades.Lia;

import Habilidades.Habilidad;
import Player.Players;
import java.util.List;

public class LiaH1 implements Habilidad {

    @Override
    public void usarHabilidad(List<Players> players, Players currentPlayer) {
        for (Players opponent : players) {
            opponent.setEscudos(0);
        }
        System.out.println("Lia destruyó todas las cartas de escudo.");
    }
}
