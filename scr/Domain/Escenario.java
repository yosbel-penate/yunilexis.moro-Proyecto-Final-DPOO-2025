package scr.Domain;

import java.util.ArrayList;

class Escenario {
    private final String nombre;
    private final String descripcion;
    private final ArrayList<NPC> npcs = new ArrayList<>();
    private final ArrayList<Enemigo> enemigos;
    public Escenario(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.enemigos = new ArrayList<>();
    }
    public void agregarNPC(NPC npc) {
        npcs.add(npc);
    }
    public void agregarEnemigo(Enemigo enemigo) {
        enemigos.add(enemigo);
    }
    public String getNombre() {
        return nombre;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public ArrayList<NPC> getNpcs() {
        return npcs;
    }
    public ArrayList<Enemigo> getEnemigos() {
        return enemigos;
    }
}