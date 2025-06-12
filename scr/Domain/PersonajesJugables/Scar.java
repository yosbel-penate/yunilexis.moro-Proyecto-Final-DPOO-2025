package scr.Domain.PersonajesJugables;

import scr.Domain.PersonajeJugable;

public class Scar extends PersonajeJugable {
    public Scar() {
        super("Scar", 50, 140, 90, "Apocalíptica");
    }

    @Override
    public void atacar() {
        System.out.println(nombre + " realiza ataque básico de Scar.");
    }

    @Override
    public void defender() {

    }

    public void habilidadEspecial() {
        System.out.println(nombre + " usa escombros.");
    }
}