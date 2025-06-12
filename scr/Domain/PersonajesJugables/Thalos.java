package scr.Domain.PersonajesJugables;

import scr.Domain.PersonajeJugable;

public class Thalos extends PersonajeJugable {
    public Thalos() {
        super("Thalos", 57, 130, 90, "Mística");
    }

    @Override
    public void atacar() {
        System.out.println(nombre + " realiza ataque básico de Thalos.");
    }

    @Override
    public void defender() {

    }

    public void habilidadEspecial() {
        System.out.println(nombre + " usa meteorito.");
    }
}