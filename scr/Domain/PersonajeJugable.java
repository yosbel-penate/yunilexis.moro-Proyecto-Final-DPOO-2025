package scr.Domain;

import scr.Domain.Items.CristalPoder;

import java.util.ArrayList;
import java.util.List;

public abstract class PersonajeJugable {
    protected String nombre;
    protected int vida;
    protected int ataqueBase;
    protected int Defensa;
    protected int mejorasAplicadas = 0;
    protected String faccion;
    protected List<String> categorias;
    protected ArrayList<Item> inventario;
    public PersonajeJugable(String nombre, int vida, int ataqueBase, int Defensa,
                            String faccion) {
        this.nombre = nombre;
        this.vida = vida;
        this.ataqueBase = ataqueBase;
        this.Defensa = Defensa;
        this.faccion = faccion;
        this.inventario = new ArrayList<>();
    }
    public void aplicarMejora(CristalPoder cristal) {
        if (cristal.getUsos() < cristal.getMaxUsos()) {
            ataqueBase += cristal.getMejoraAtaque();
            Defensa += cristal.getMejoraDefensa();
            mejorasAplicadas++;
            cristal.incrementarUsos();
        }
    }
    public void usarItem(Item item) {
        if (inventario.contains(item)) {
            item.usar(this);
            inventario.remove(item);
        }
    }
    public abstract void atacar();
    public abstract void defender();
    public String getNombre() {
        return nombre;
    }
    public int getVida() {
        return vida;
    }
    public void setVida(int vida) {
        this.vida = vida;
    }
    public int getAtaqueBase() {
        return ataqueBase;
    }
    public void setAtaqueBase(int ataqueBase) {
        this.ataqueBase = ataqueBase;
    }
    public int getDefensa() {
        return Defensa;
    }
    public void setDefensa(int defensa) {
        this.Defensa = defensa;
    }

}