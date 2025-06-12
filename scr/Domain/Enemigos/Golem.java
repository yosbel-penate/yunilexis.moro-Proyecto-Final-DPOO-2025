package scr.Domain.Enemigos;

import scr.Domain.Enemigo;

public class Golem extends Enemigo {
    public Golem() {
        super("Gólem", "Robusto/Combate cercano", "Gigante de piedra", "Ataques lentos pero potentes");
    }

    @Override
    public void ataqueBasico() {
        System.out.println(nombre + " golpea con su puño de piedra.");
    }

    public void puñetazoPiedra() {
        System.out.println(nombre + " embiste con un puñetazo de piedra.");
    }
}