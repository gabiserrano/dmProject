package Habilidades.MinscAndBoo;

import Habilidades.Habilidad;
import Player.Players;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinscAndBooH2 implements Habilidad {

    @Override
    public void usarHabilidad(List<Players> players, Players currentPlayer) {
        List<Integer> healths = new ArrayList<>();
        for (Players player : players) {
            healths.add(player.getHealth());
        }
        Collections.rotate(healths, 1);
        int index = 0;
        for (Players player : players) {
            player.setHealth(healths.get(index++));
        }
        System.out.println("Minsc and Boo intercambiaron los puntos de vida de todos los jugadores.");
    }
}
