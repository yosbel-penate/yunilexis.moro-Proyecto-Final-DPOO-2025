package scr.Domain.PersonajesJugables;

import scr.Domain.PersonajeJugable;

public class DraVectra extends PersonajeJugable {
    public DraVectra() {
        super("DraVectra", 44, 90, 160, "Antigua");
    }

    @Override
    public void atacar() {
        System.out.println(nombre + " realiza ataque básico de DraVectra.");
    }

    @Override
    public void defender() {

    }

    public void habilidadEspecial() {
        System.out.println(nombre + " usa latigo laser.");
    }
}