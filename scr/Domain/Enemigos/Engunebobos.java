package scr.Domain.Enemigos;

import scr.Domain.Enemigo;

public class Engunebobos extends Enemigo {
    public Engunebobos() {
        super(
                "Enguñebobos",           // nombre
                "Sigilo",                // categoría
                "Criatura pequeña y rápida", // apariencia
                "Mordisco constante",    // estrategia
                100,                     // vida
                40,                      // ataqueBase
                15                       // defensa
        );
    }

    @Override
    public void ataqueBasico() {
        System.out.println(nombre + " muerde con furia con fuerza " + ataqueBase + ".");
    }

    public void mordiscoConstante() {
        System.out.println(nombre + " ataca con mordiscos continuos.");
    }
}
