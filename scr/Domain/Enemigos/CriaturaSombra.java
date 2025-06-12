package scr.Domain.Enemigos;

import scr.Domain.Enemigo;

public class CriaturaSombra extends Enemigo {
    public CriaturaSombra() {
        super(
                "Criatura de sombra",         // nombre
                "Combate cercano",            // categoria
                "Sombra oscura con garras",  // apariencia
                "Ataca por sorpresa",         // estrategia
                120,                         // vida
                35,                          // ataqueBase
                20                           // defensa
        );
    }

    @Override
    public void ataqueBasico() {
        System.out.println(nombre + " lanza un zarpazo de sombra con fuerza " + ataqueBase + ".");
    }

    public void zarpazoSombra() {
        System.out.println(nombre + " paraliza con zarpazo sombrío.");
    }

    public void aparecerCasilla() {
        System.out.println(nombre + " aparece de la sombra sigilosamente.");
    }
}
