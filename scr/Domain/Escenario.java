package scr.Domain;

import java.util.ArrayList;

class Escenario {
    private String nombre;
    private String descripcion;
    private ArrayList<NPC> npcs = new ArrayList<>();
    private ArrayList<Enemigo> enemigos;
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