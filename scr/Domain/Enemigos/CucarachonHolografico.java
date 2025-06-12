package scr.Domain.Enemigos;

import scr.Domain.Enemigo;

public class CucarachonHolografico extends Enemigo {
    public CucarachonHolografico() {
        super("Cucarachón holográfico", "Jefe de facción", "Insecto digital", "Rayo láser, resistencia holográfica");
    }

    @Override
    public void ataqueBasico() {
        System.out.println(nombre + " dispara proyectiles holográficos.");
    }

    public void rayoLaser() {
        System.out.println(nombre + " utiliza un rayo láser intenso.");
    }

    public void resistenciaHolografica() {
        System.out.println(nombre + " activa su campo holográfico protector.");
    }
}