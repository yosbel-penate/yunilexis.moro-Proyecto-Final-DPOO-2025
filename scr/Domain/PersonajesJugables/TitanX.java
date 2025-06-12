package scr.Domain.PersonajesJugables;

import scr.Domain.PersonajeJugable;

public class TitanX extends PersonajeJugable {
    public TitanX() {
        super("TitanX", 55, 150, 80, "Futurista");
    }

    @Override
    public void atacar() {
        System.out.println(nombre + " realiza ataque básico de TitanX.");
    }

    @Override
    public void defender() {

    }

    public void habilidadEspecial() {
        System.out.println(nombre + " usa puñetazo.");
    }
}