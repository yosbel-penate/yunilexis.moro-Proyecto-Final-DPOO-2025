package scr.Domain.Items;

import scr.Domain.Item;
import scr.Domain.PersonajeJugable;

public class CristalPoder extends Item {
    private final int mejoraAtaque = 5;
    private final int mejoraDefensa = 3;
    private int usos = 0;
    private final int maxUsos = 3;
    public CristalPoder() {
        super("Cristal de Poder", "Mejora");
    }
    @Override
    public void usar(Object objetivo) {
        if (objetivo instanceof PersonajeJugable pj) {
            if (usos < maxUsos) {
                pj.setAtaqueBase(pj.getAtaqueBase() + mejoraAtaque);
                pj.setDefensa(pj.getDefensa() + mejoraDefensa);
                usos++;
                System.out.println(pj.getNombre() + " ha mejorado ataque y defensa con un Cristal de Poder.");
            } else {
                System.out.println("El Cristal de Poder ha agotado sus usos.");
            }
        } else {
            System.out.println("Objetivo inválido para Cristal de Poder.");
        }
    }
    public int getUsos() {
        return usos;
    }
    public int getMaxUsos() {
        return maxUsos;
    }
    public int getMejoraAtaque() {
        return mejoraAtaque;
    }
    public int getMejoraDefensa() {
        return mejoraDefensa;
    }
    public void incrementarUsos() {
        usos++;
    }
}
