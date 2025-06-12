package scr.Domain.Enemigos;

import scr.Domain.Enemigo;

public class Golem extends Enemigo {
    public Golem() {
        super(
                "Gólem",                   // nombre
                "Robusto/Combate cercano", // categoría
                "Gigante de piedra",       // apariencia
                "Ataques lentos pero potentes", // estrategia
                350,                      // vida
                80,                       // ataqueBase
                70                        // defensa
        );
    }

    @Override
    public void ataqueBasico() {
        System.out.println(nombre + " golpea con su puño de piedra con fuerza " + ataqueBase + ".");
    }

    public void punetazoPiedra() {
        System.out.println(nombre + " embiste con un puñetazo de piedra.");
    }
}
