package scr.Domain.Enemigos;

import scr.Domain.Enemigo;

public class OblivionCore extends Enemigo {
    public OblivionCore() {
        super(
                "Oblivion Core",          // nombre
                "Jefe Final",             // categoría
                "Núcleo de energía oscura", // apariencia
                "Lluvia de espadas y golpe asesino", // estrategia
                400,                      // vida
                95,                       // ataqueBase
                70                        // defensa
        );
    }

    @Override
    public void ataqueBasico() {
        System.out.println(nombre + " lanza fragmentos oscuros con poder " + ataqueBase + ".");
    }

    public void lluviaEspadas() {
        System.out.println(nombre + " invoca lluvia de espadas sombrías.");
    }

    public void golpeAsesino() {
        System.out.println(nombre + " ejecuta un golpe devastador.");
    }
}
