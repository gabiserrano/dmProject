import Cartas.Carta;
import Player.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static List<Personaje> personajes = new ArrayList<>();

    public static void main(String[] args) {
        personajes = Personaje.generarPersonajes();
        Tablero.crearJugador(personajes);
        Tablero.imprimirJugadores();
        Tablero.empezarPartida();
    }
}
