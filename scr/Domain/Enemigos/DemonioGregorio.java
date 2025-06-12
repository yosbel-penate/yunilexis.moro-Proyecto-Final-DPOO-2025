package scr.Domain.Enemigos;

import scr.Domain.Enemigo;

public class DemonioGregorio extends Enemigo {
    public DemonioGregorio() {
        super(
                "Demonio Gregorio",     // nombre
                "Jefe de facción",      // categoría
                "Demonio infernal",     // apariencia
                "Bola de fuego y géiser", // estrategia
                300,                   // vida
                85,                    // ataqueBase
                65                     // defensa
        );
    }

    @Override
    public void ataqueBasico() {
        System.out.println(nombre + " arroja una bola de fuego menor con potencia " + ataqueBase + ".");
    }

    public void bolaFuego() {
        System.out.println(nombre + " lanza una gigantesca bola de fuego.");
    }

    public void invocarGeiser() {
        System.out.println(nombre + " invoca un géiser de lava.");
    }
}
