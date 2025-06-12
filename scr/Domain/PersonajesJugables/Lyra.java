package scr.Domain.PersonajesJugables;

import scr.Domain.PersonajeJugable;

public class Lyra extends PersonajeJugable {
    public Lyra() {
        super("Lyra", 28, 85, 130, "Medieval");
    }

    @Override
    public void atacar() {
        System.out.println(nombre + " realiza ataque básico de Lyra.");
    }

    @Override
    public void defender() {

    }

    public void habilidadEspecial() {
        System.out.println(nombre + " usa melodia.");
    }
}