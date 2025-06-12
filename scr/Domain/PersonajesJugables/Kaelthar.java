package scr.Domain.PersonajesJugables;

import scr.Domain.PersonajeJugable;

public class Kaelthar extends PersonajeJugable {
    public Kaelthar() {
        super("Kaelthar", 50, 110, 100, "Antigua");
    }

    @Override
    public void atacar() {
        System.out.println(nombre + " realiza ataque básico de Kaelthar.");
    }

    @Override
    public void defender() {

    }

    public void habilidadEspecial() {
        System.out.println(nombre + " usa estocada fuego.");
    }
}