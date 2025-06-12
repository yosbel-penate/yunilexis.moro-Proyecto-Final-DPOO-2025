package scr.Domain.PersonajesJugables;

import scr.Domain.PersonajeJugable;

public class Luna9 extends PersonajeJugable {
    public Luna9() {
        super("Luna9", 25, 75, 180, "Futurista");
    }

    @Override
    public void atacar() {
        System.out.println(nombre + " realiza ataque básico de Luna9.");
    }

    @Override
    public void defender() {

    }

    public void habilidadEspecial() {
        System.out.println(nombre + " usa cuchillada.");
    }
}