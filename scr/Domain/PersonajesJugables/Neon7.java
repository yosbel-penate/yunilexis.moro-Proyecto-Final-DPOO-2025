package scr.Domain.PersonajesJugables;

import scr.Domain.PersonajeJugable;

public class Neon7 extends PersonajeJugable {
    public Neon7() {
        super("Neon7", 40, 100, 140, "Futurista");
    }

    @Override
    public void atacar() {
        System.out.println(nombre + " realiza ataque básico de Neon7.");
    }

    @Override
    public void defender() {

    }

    public void habilidadEspecial() {
        System.out.println(nombre + " usa misiles.");
    }
}