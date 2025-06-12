package scr.Domain.PersonajesJugables;

import scr.Domain.PersonajeJugable;

public class Marrow extends PersonajeJugable {
    public Marrow() {
        super("Marrow", 55, 70, 100, "Apocalíptica");
    }

    @Override
    public void atacar() {
        System.out.println(nombre + " realiza ataque básico de Marrow.");
    }

    @Override
    public void defender() {

    }

    public void habilidadEspecial() {
        System.out.println(nombre + " usa vomito acido.");
    }
}