package scr.Domain.Items;

import scr.Domain.Item;
import scr.Domain.Jugador;
import scr.Domain.PersonajeJugable;

public class PocionVida extends Item {
    public PocionVida() {
        super("Poción de Vida", "Consumible");
    }
    @Override
    public void usar(Object objetivo) {
        if (objetivo instanceof PersonajeJugable pj) {
            int curacion = 30;
            int nuevaVida = pj.getVida() + curacion;
            pj.setVida(nuevaVida);
            System.out.println(pj.getNombre() + " ha recuperado " + curacion + "puntos de vida");
        } else if (objetivo instanceof Jugador jugador) {
            System.out.println(jugador.getNombre() + " usó una Poción de Vida.");
        } else {
            System.out.println("Objetivo inválido para Poción de Vida.");
        }
    }
}

