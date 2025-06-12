package scr.Domain;

import java.util.ArrayList;

public class Juego {
    private ArrayList<Jugador> jugadores;
    private Mapa mapa;
    public Juego() {
        jugadores = new ArrayList<>();
        mapa = new Mapa("Mundo de Aventura", "Un mundo lleno de desafíos y secretos.");
    }
    public void iniciar() {
        System.out.println("El juego ha comenzado.");
    }
    public void combatirEnemigo(String nombreEnemigo) {
        System.out.println("Combatiendo contra: " + nombreEnemigo);
    }
    public void finalizar() {
        System.out.println("El juego ha finalizado.");
    }
    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }
    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }
    public Mapa getMapa() {
        return mapa;
    }
    public void setMapa(Mapa mapa) {
        this.mapa = mapa;
    }
}