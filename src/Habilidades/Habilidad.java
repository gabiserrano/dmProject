package Habilidades;

import Player.Players;
import java.util.List;

public interface Habilidad {
    void usarHabilidad(List<Players> jugadores, Players currentPlayer);
}
