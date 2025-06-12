package scr.Domain.Enemigos;

import scr.Domain.Enemigo;

public class Enguñebobos extends Enemigo {
    public Enguñebobos() {
        super("Enguñebobos", "Sigilo", "Criatura pequeña y rápida", "Mordisco constante");
    }

    @Override
    public void ataqueBasico() {
        System.out.println(nombre + " muerde con furia.");
    }

    public void mordiscoConstante() {
        System.out.println(nombre + " ataca con mordiscos continuos.");
    }
}