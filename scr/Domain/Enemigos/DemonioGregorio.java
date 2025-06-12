package scr.Domain.Enemigos;

import scr.Domain.Enemigo;

public class DemonioGregorio extends Enemigo {
    public DemonioGregorio() {
        super("Demonio Gregorio", "Jefe de facción", "Demonio infernal", "Bola de fuego y géiser");
    }

    @Override
    public void ataqueBasico() {
        System.out.println(nombre + " arroja una bola de fuego menor.");
    }

    public void bolaFuego() {
        System.out.println(nombre + " lanza una gigantesca bola de fuego.");
    }

    public void invocarGeiser() {
        System.out.println(nombre + " invoca un géiser de lava.");
    }
}