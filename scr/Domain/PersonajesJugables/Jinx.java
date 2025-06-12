package scr.Domain.PersonajesJugables;

import scr.Domain.PersonajeJugable;

public class Jinx extends PersonajeJugable {
    public Jinx() {
        super("Jinx", 40, 95, 120, "Apocalíptica");
    }

    @Override
    public void atacar() {
        System.out.println(nombre + " realiza ataque básico de Jinx.");
    }

    @Override
    public void defender() {

    }

    public void habilidadEspecial() {
        System.out.println(nombre + " usa drenar vida.");
    }
}