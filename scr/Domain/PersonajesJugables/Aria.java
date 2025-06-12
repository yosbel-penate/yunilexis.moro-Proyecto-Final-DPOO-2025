package scr.Domain.PersonajesJugables;

import scr.Domain.PersonajeJugable;

public class Aria extends PersonajeJugable {
    public Aria() {
        super("Aria", 30, 90, 120, "Antigua");
    }

    @Override
    public void atacar() {
        System.out.println(nombre + " realiza ataque básico de Aria.");
    }

    @Override
    public void defender() {

    }

    public void habilidadEspecial() {
        System.out.println(nombre + " usa empujar ventisca.");
    }
}