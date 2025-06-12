package scr.Domain.PersonajesJugables;

import scr.Domain.PersonajeJugable;

public class Nyx extends PersonajeJugable {
    public Nyx() {
        super("Nyx", 35, 80, 140, "Antigua");
    }

    @Override
    public void atacar() {
        System.out.println(nombre + " realiza ataque básico de Nyx.");
    }

    @Override
    public void defender() {

    }

    public void habilidadEspecial() {
        System.out.println(nombre + " usa ataque araña.");
    }
}