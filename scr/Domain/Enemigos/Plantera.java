package scr.Domain.Enemigos;

import scr.Domain.Enemigo;

public class Plantera extends Enemigo {
    public Plantera() {
        super("Plantera", "Jefe de facción", "Planta gigante y venenosa", "Raíces venenosas");
    }

    @Override
    public void ataqueBasico() {
        System.out.println(nombre + " azota con enredaderas.");
    }

    public void raicesVenenosas() {
        System.out.println(nombre + " lanza raíces cargadas de veneno.");
    }
}