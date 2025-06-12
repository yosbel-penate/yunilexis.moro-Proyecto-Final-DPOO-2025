package scr.Domain.PersonajesJugables;

import scr.Domain.PersonajeJugable;

public class Elysia extends PersonajeJugable {
    public Elysia() {
        super("Elysia", 32, 80, 170, "Antigua");
    }

    @Override
    public void atacar() {
        System.out.println(nombre + " realiza ataque básico de Elysia.");
    }

    @Override
    public void defender() {

    }

    public void habilidadEspecial() {
        System.out.println(nombre + " usa detener tiempo.");
    }
}