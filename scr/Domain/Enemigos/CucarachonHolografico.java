package scr.Domain.Enemigos;

import scr.Domain.Enemigo;

public class CucarachonHolografico extends Enemigo {
    public CucarachonHolografico() {
        super(
                "Cucarachón holográfico",  // nombre
                "Jefe de facción",         // categoría
                "Insecto digital",         // apariencia
                "Rayo láser, resistencia holográfica", // estrategia
                200,                       // vida
                75,                        // ataqueBase
                50                         // defensa
        );
    }

    @Override
    public void ataqueBasico() {
        System.out.println(nombre + " dispara proyectiles holográficos con potencia " + ataqueBase + ".");
    }

    public void rayoLaser() {
        System.out.println(nombre + " utiliza un rayo láser intenso.");
    }

    public void resistenciaHolografica() {
        System.out.println(nombre + " activa su campo holográfico protector.");
    }
}
