package scr.Domain.Enemigos;

import scr.Domain.Enemigo;

public class BrujaNocturna extends Enemigo {
    public BrujaNocturna() {
        super("Bruja nocturna", "Jefe de facción", "Hechicera oscura", "Hechizos de parálisis y silencio");
    }

    @Override
    public void ataqueBasico() {
        System.out.println(nombre + " lanza un orbe de energía oscura.");
    }

    public void hechizoParalizante() {
        System.out.println(nombre + " paraliza al objetivo con magia.");
    }

    public void silenciarHabilidades() {
        System.out.println(nombre + " silencia las habilidades del enemigo.");
    }
}