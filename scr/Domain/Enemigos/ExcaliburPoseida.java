package scr.Domain.Enemigos;

import scr.Domain.Enemigo;

public class ExcaliburPoseida extends Enemigo {
    public ExcaliburPoseida() {
        super(
                "Excalibur poseída",    // nombre
                "Jefe de facción",      // categoría
                "Espada animada",       // apariencia
                "Corte veloz",          // estrategia
                180,                    // vida
                70,                     // ataqueBase
                40                      // defensa
        );
    }

    @Override
    public void ataqueBasico() {
        System.out.println(nombre + " ejecuta un corte fantasmal con fuerza " + ataqueBase + ".");
    }

    public void corteVeloz() {
        System.out.println(nombre + " realiza un corte veloz que atraviesa armaduras.");
    }
}
