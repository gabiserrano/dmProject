package Habilidades.Blorp;

import Habilidades.Habilidad;
import Player.Players;
import java.util.List;

public class BlorpH1 implements Habilidad {

    @Override
    public void usarHabilidad(List<Players> players, Players currentPlayer) {
        currentPlayer.setIgnorarEscudos(true);
        System.out.println("Los ataques de Blorp ignoran los escudos este turno.");
    }
}
