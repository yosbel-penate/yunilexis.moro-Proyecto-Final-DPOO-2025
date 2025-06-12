package scr.Domain.PersonajesJugables;

import scr.Domain.PersonajeJugable;

public class Rook extends PersonajeJugable {
    public Rook() {
        super("Rook", 66, 100, 100, "Medieval");
    }

    @Override
    public void atacar() {
        System.out.println(nombre + " realiza ataque básico de Rook.");
    }

    @Override
    public void defender() {

    }

    public void habilidadEspecial() {
        System.out.println(nombre + " usa hacha boomerang.");
    }
}