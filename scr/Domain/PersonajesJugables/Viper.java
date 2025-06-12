package scr.Domain.PersonajesJugables;

import scr.Domain.PersonajeJugable;

public class Viper extends PersonajeJugable {
    public Viper() {
        super("Viper", 28, 85, 160, "Apocalíptica");
    }

    @Override
    public void atacar() {
        System.out.println(nombre + " realiza ataque básico de Viper.");
    }

    @Override
    public void defender() {

    }

    public void habilidadEspecial() {
        System.out.println(nombre + " usa bala veneno.");
    }
}