package scr.Domain.PersonajesJugables;

import scr.Domain.PersonajeJugable;

public class SirGareth extends PersonajeJugable {
    public SirGareth() {
        super("SirGareth", 53, 130, 110, "Medieval");
    }

    @Override
    public void atacar() {
        System.out.println(nombre + " realiza ataque básico de SirGareth.");
    }

    @Override
    public void defender() {

    }

    public void habilidadEspecial() {
        System.out.println(nombre + " usa golpe mayal.");
    }
}