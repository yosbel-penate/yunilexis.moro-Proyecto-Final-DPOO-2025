package scr.Domain.PersonajesJugables;

import scr.Domain.PersonajeJugable;

public class Vespera extends PersonajeJugable {
    public Vespera() {
        super("Vespera", 25, 70, 150, "Medieval");
    }

    @Override
    public void atacar() {
        System.out.println(nombre + " realiza ataque básico de Vespera.");
    }

    @Override
    public void defender() {

    }

    public void habilidadEspecial() {
        System.out.println(nombre + " usa pocion explosiva.");
    }
}