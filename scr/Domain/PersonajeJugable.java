package scr.Domain;

import scr.Domain.Items.CristalPoder;

import java.util.ArrayList;
import java.util.List;

public abstract class PersonajeJugable {
    protected String nombre;
    protected int vida;
    protected int ataqueBase;
    protected int armaduraBase;
    protected int mejorasAplicadas = 0;
    protected String faccion;
    protected List<String> categorias;
    protected ArrayList<Item> inventario;
    public PersonajeJugable(String nombre, int vida, int ataqueBase, int armaduraBase,
                            String faccion, List<String> categorias) {
        this.nombre = nombre;
        this.vida = vida;
        this.ataqueBase = ataqueBase;
        this.armaduraBase = armaduraBase;
        this.faccion = faccion;
        this.categorias = categorias;
        this.inventario = new ArrayList<>();
    }
    public void aplicarMejora(CristalPoder cristal) {
        if (cristal.getUsos() < cristal.getMaxUsos()) {
            ataqueBase += cristal.getMejoraAtaque();
            armaduraBase += cristal.getMejoraDefensa();
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
    public int getArmaduraBase() {
        return armaduraBase;
    }
    public void setArmaduraBase(int armaduraBase) {
        this.armaduraBase = armaduraBase;
    }
    public String getFaccion() {
        return faccion;
    }
    public List<String> getCategorias() {
        return categorias;
    }
}