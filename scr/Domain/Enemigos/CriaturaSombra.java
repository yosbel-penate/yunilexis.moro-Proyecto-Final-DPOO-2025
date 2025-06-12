package scr.Domain.Enemigos;

import scr.Domain.Enemigo;

public class CriaturaSombra extends Enemigo {
    public CriaturaSombra() {
        super("Criatura de sombra", "Combate cercano", "Sombra oscura con garras", "Ataca por sorpresa");
    }

    @Override
    public void ataqueBasico() {
        System.out.println(nombre + " lanza un zarpazo de sombra.");
    }

    public void zarpazoSombra() {
        System.out.println(nombre + " paraliza con zarpazo sombrío.");
    }

    public void aparecerCasilla() {
        System.out.println(nombre + " aparece de la sombra.");
    }
}