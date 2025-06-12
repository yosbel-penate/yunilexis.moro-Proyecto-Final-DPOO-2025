package scr.Domain.PersonajesJugables;

import scr.Domain.PersonajeJugable;

public class Z3r0 extends PersonajeJugable {
    public Z3r0() {
        super("Z3r0", 34, 80, 150, "Futurista");
    }

    @Override
    public void atacar() {
        System.out.println(nombre + " realiza ataque básico de Z3r0.");
    }

    @Override
    public void defender() {

    }

    public void habilidadEspecial() {
        System.out.println(nombre + " usa proyectil holografico.");
    }
}