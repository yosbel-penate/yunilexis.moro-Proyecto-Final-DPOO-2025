package scr.Domain.Enemigos;

import scr.Domain.Enemigo;

public class Plantera extends Enemigo {
    public Plantera() {
        super(
                "Plantera",                  // nombre
                "Jefe de facción",           // categoría
                "Planta gigante y venenosa",// apariencia
                "Raíces venenosas",          // estrategia
                280,                        // vida
                80,                         // ataqueBase
                55                          // defensa
        );
    }

    @Override
    public void ataqueBasico() {
        System.out.println(nombre + " azota con enredaderas con fuerza " + ataqueBase + ".");
    }

    public void raicesVenenosas() {
        System.out.println(nombre + " lanza raíces cargadas de veneno.");
    }
}
