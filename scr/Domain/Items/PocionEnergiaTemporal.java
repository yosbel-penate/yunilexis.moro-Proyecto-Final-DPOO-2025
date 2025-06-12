package scr.Domain.Items;

import scr.Domain.Item;
import scr.Domain.Jugador;

class PocionEnergiaTemporal extends Item {

    public PocionEnergiaTemporal() {
        super("Poción de Energía Temporal", "Especial");
    }

    @Override
    public void usar(Object objetivo) {
        if (objetivo instanceof Jugador jugador) {
            int energiaActual = jugador.getEnergiaTemporal();
            int incrementoReclutas = 1;
            jugador.setEnergiaTemporal(energiaActual + incrementoReclutas);
            System.out.println(jugador.getNombre() + " ha incrementado su energía temporal en " + incrementoReclutas);
        } else {
            System.out.println("Objetivo inválido para Poción de Energía Temporal.");
        }
    }
}