package scr.Domain.PersonajesJugables;

import scr.Domain.PersonajeJugable;

public class Seraphine extends PersonajeJugable {
    public Seraphine() {
        super("Seraphine", 25, 75, 180, "Mística");
    }

    @Override
    public void atacar() {
        System.out.println(nombre + " realiza ataque básico de Seraphine.");
    }

    @Override
    public void defender() {

    }

    public void habilidadEspecial() {
        System.out.println(nombre + " usa curar.");
    }
}