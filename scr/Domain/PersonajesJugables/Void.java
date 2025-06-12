package scr.Domain.PersonajesJugables;

import scr.Domain.PersonajeJugable;

public class Void extends PersonajeJugable {
    public Void() {
        super("Void", 47, 100, 140, "Mística");
    }

    @Override
    public void atacar() {
        System.out.println(nombre + " realiza ataque básico de Void.");
    }

    @Override
    public void defender() {

    }

    public void habilidadEspecial() {
        System.out.println(nombre + " usa orbe oscuro.");
    }
}