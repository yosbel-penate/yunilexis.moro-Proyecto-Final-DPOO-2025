package scr.Domain.Enemigos;

import scr.Domain.Enemigo;

public class OblivionCore extends Enemigo {
    public OblivionCore() {
        super("Oblivion Core", "Jefe Final", "Núcleo de energía oscura", "Lluvia de espadas y golpe asesino");
    }

    @Override
    public void ataqueBasico() {
        System.out.println(nombre + " lanza fragmentos oscuros.");
    }

    public void lluviaEspadas() {
        System.out.println(nombre + " invoca lluvia de espadas sombrías.");
    }

    public void golpeAsesino() {
        System.out.println(nombre + " ejecuta un golpe devastador.");
    }
}