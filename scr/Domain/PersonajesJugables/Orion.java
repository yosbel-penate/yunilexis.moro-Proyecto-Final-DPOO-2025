package scr.Domain.PersonajesJugables;

import scr.Domain.PersonajeJugable;

public class Orion extends PersonajeJugable {
    public Orion() {
        super("Orion", 65, 110, 130, "Futurista");
    }

    @Override
    public void atacar() {
        System.out.println(nombre + " realiza ataque básico de Orion.");
    }

    @Override
    public void defender() {

    }

    public void habilidadEspecial() {
        System.out.println(nombre + " usa rayo laser.");
    }
}