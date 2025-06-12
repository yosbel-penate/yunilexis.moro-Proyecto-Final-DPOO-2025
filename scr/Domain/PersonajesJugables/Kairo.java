package scr.Domain.PersonajesJugables;

import scr.Domain.PersonajeJugable;

public class Kairo extends PersonajeJugable {
    public Kairo() {
        super("Kairo", 36, 85, 160, "Mística");
    }

    @Override
    public void atacar() {
        System.out.println(nombre + " realiza ataque básico de Kairo.");
    }

    @Override
    public void defender() {

    }

    public void habilidadEspecial() {
        System.out.println(nombre + " usa orbe luminoso.");
    }
}