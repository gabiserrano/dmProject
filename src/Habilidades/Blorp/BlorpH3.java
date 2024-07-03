package Habilidades.Blorp;

import Habilidades.Habilidad;
import Player.Players;
import java.util.List;

public class BlorpH3 implements Habilidad {

    @Override
    public void usarHabilidad(List<Players> players, Players currentPlayer) {
        currentPlayer.setAtaquesDobles(true);
        System.out.println("Blorp atacará dos veces cuando una carta sea destruida.");
    }
}
