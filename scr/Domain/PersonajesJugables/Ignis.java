package scr.Domain.PersonajesJugables;

import scr.Domain.PersonajeJugable;

public class Ignis extends PersonajeJugable {
    public Ignis() {
        super("Ignis", 60, 95, 120, "Medieval");
    }

    @Override
    public void atacar() {
        System.out.println(nombre + " realiza ataque básico de Ignis.");
    }

    @Override
    public void defender() {

    }

    public void habilidadEspecial() {
        System.out.println(nombre + " usa llamarada.");
    }
}