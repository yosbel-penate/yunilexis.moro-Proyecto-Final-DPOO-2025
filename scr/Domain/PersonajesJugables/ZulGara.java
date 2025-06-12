package scr.Domain.PersonajesJugables;

import scr.Domain.PersonajeJugable;

public class ZulGara extends PersonajeJugable {
    public ZulGara() {
        super("ZulGara", 47, 120, 90, "Antigua");
    }

    @Override
    public void atacar() {
        System.out.println(nombre + " realiza ataque básico de ZulGara.");
    }

    @Override
    public void defender() {

    }

    public void habilidadEspecial() {
        System.out.println(nombre + " usa zarpazo.");
    }
}