package scr.Domain.Enemigos;

import scr.Domain.Enemigo;

public class ExcaliburPoseida extends Enemigo {
    public ExcaliburPoseida() {
        super("Excalibur poseída", "Jefe de facción", "Espada animada", "Corte veloz");
    }

    @Override
    public void ataqueBasico() {
        System.out.println(nombre + " ejecuta un corte fantasmal.");
    }

    public void corteVeloz() {
        System.out.println(nombre + " realiza un corte veloz que atraviesa armaduras.");
    }
}